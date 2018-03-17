package com.dubbo;

import com.dubbo.inter.Animal;
import com.dubbo.proxy.ProxyHandler;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Class.forName("com.dubbo.entity.Cat");
//		Animal a = (Animal)clazz.newInstance();
		ProxyHandler proxy = new ProxyHandler();
		Animal a = (Animal) proxy.bind(clazz.newInstance());
		a.say();
		
	}
	
}
