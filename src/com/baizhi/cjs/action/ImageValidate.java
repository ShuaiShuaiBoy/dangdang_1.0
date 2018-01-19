package com.baizhi.cjs.action;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import validate.CreateValidateCode;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class ImageValidate implements Action {
	private static Logger log = Logger.getLogger(ImageValidate.class);

	public String execute() throws Exception {
		ValueStack vs = ActionContext.getContext().getValueStack();
		HttpServletResponse response = ServletActionContext.getResponse();
		CreateValidateCode cvc = new CreateValidateCode();
		String code = cvc.getCode();
		log.info(code.toString());
		vs.setValue("#session.code", code);
		OutputStream os= response.getOutputStream();
		cvc.write(os);
		return null;
	}

}
