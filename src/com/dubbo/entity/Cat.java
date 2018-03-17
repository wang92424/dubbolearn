package com.dubbo.entity;

import com.dubbo.inter.Animal;

public class Cat implements Animal{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("MiaoMiaoMiao!");
	}

}
