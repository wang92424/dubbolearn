package com.dubbo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {

	private Object tar;

	public Object bind(Object tar) {
		this.tar = tar;
		return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//拦截代理对象在执行前替换远程调用对象
		
		//发现服务，通过netty读取对象实现，反序列化成原有对象
//		Socket socket = new Socket();
		//执行具体方法，返回远程方法值
		
		//比如执行syso
		System.out.println("1111");
		Object invoke = method.invoke(tar, args);
		System.out.println("2222");
		
		
		return invoke;
	}

}
