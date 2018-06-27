package com.myapp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TwitterServiceInvocationHandler implements InvocationHandler {
	
	Object obj;
	
	public TwitterServiceInvocationHandler(Object obj){
		System.out.println("inside cons");
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("inside invoke");
		Object result;
		if(method.getName().contains("post")){
			 throw new IllegalAccessException("Posts are currently not allowed");
		}else
			result=method.invoke(obj, args);
		return result;
	}
	
	public static Object newInstance (Object obj) {
		System.out.println("inside newInstance");
		//reflection api class Proxy helps us in creating in proxy object
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new TwitterServiceInvocationHandler(obj));
	}

}
