package com.baizhi.cjs.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.service.UserService;
import com.baizhi.cjs.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class UserAction extends ActionSupport {
	private static Logger log = Logger.getLogger(UserAction.class);
	private User user;
	private String password2;
	private String uuid;
	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String loginUser(){
		UserService us = new UserServiceImpl();
		user = us.login(user);
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.user",user);
		if(vs.findString("#session.url")!=null&&vs.findValue("#session.cart")!=null){
			return "buy";
		}
		return "success";
	}
	public String registerUser(){
		UserService us = new UserServiceImpl();
		user.setCode("123");
		us.register(user, password2);
		user = us.login(user);
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.user",user);
		UUID ud = UUID.randomUUID();
		uuid = ud.toString();
		log.info(uuid.toString());
		vs.setValue("#session.uuid", uuid);
		return "success";
	}
	public String quitUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		if(session.getAttribute("url")!=null){
			session.removeAttribute("url");
		}
		return "success";
	}
	
	public String checkUser(){
		UserService us = new UserServiceImpl();
		ValueStack vs = ActionContext.getContext().getValueStack();
		log.info(uuid.toString());
		if(uuid.equals(vs.findString("#session.uuid"))){
			user = (User)vs.findValue("#session.user");
			us.checkEmail(user);
		}
		return "success";
	}
	
	public String queryEmail() throws IOException{
		UserService us = new UserServiceImpl();
		ServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(us.queryEmail(user)){
			out.print("<span style='color:green'>可以使用此Email</span>");
			out.flush();
		}else{
			out.print("<span style='color:red'>此Email已被注册，请修改密码</span>");
			out.flush();
		}
		return null;
	}
}
