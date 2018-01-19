package com.baizhi.cjs.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class LoginInterceptor implements Interceptor {

	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		ValueStack vs = ActionContext.getContext().getValueStack();
		if(vs.findValue("#session.user")!=null){
			arg0.invoke();
			return null;
		}else{
			vs.setValue("#session.url", "cart");
			return "login";
		}
	}

}
