/*
 * Copyright 2014
 * author jiangyukun
 */

package web;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.InternalPathMethodNameResolver;
import org.springframework.web.servlet.mvc.multiaction.MethodNameResolver;

/**
 * inherit from AbstractContrller
 * @author jiangyukun
 *
 */

public class CustomMultiActionController extends AbstractController {
	
	private Map<String, Method> handlerMethodMap = new HashMap<String, Method>();

	private MethodNameResolver methodNameResolver = new InternalPathMethodNameResolver();

	HttpServletRequest request;

	HttpServletResponse response;

	public CustomMultiActionController() {
		registerHandlerMethods();
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		this.request = request;
		this.response = response;
		String methodName = methodNameResolver.getHandlerMethodName(request);
		if (handlerMethodMap.get(methodName) == null) {
			return new ModelAndView(methodName);
		} else {
			return invokeNamedMethod(methodName);
		}
	}

	private void registerHandlerMethods() {
		Method[] methods = this.getClass().getMethods();
		for (Method method : methods) {
			registerHandlerMethod(method);
		}
	}

	private void registerHandlerMethod(Method mothod) {
		handlerMethodMap.put(mothod.getName(), mothod);
	}

	private final ModelAndView invokeNamedMethod(String methodName) throws Exception {
		Method method = this.handlerMethodMap.get(methodName);
		if (method == null) {
			throw new Exception("error");
		}
		try {
			return (ModelAndView) method.invoke(this, request, response);
		} catch(Exception e) {
			
		}
		return null;
	}
}
