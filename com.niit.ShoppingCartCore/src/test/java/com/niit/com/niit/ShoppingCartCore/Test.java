package com.niit.com.niit.ShoppingCartCore;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args){
		AnnotationConfigApplicationContext Context=new AnnotationConfigApplicationContext();
		Context.scan("com.niit.com.niit.ShoppingCartCore");
		Context.refresh();
		Category c1=(Category)Context.getBean("category");
		c1.setId("101");
		
		System.out.println(c1.getId());
		System.out.println("Category iscreated");
	}
}
