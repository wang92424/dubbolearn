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

		//���ش��������ִ��ǰ�滻Զ�̵��ö���
		
		//���ַ���ͨ��netty��ȡ����ʵ�֣������л���ԭ�ж���
//		Socket socket = new Socket();
		//ִ�о��巽��������Զ�̷���ֵ
		
		//����ִ��syso
		System.out.println("1111");
		Object invoke = method.invoke(tar, args);
		System.out.println("2222");
		
		
		return invoke;
	}

}
