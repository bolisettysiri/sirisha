package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.ShoppingCart.Model.User;

import com.niit.ShoppingCart.dao.UserDAO;

public class UserTest {
	public static void main(String[] args){
		@SuppressWarnings("resource")
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com.niit.Shoppingcart");
context.refresh();
UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		User user=(User)context.getBean("user");
		user.setId("CG120");
		user.setName("CG Name120");
		user.setPassword("siri");
		user.setMobile(8142554677.0);
		user.setMail("bolisettysiri");
		user.setAddress("CG Desc120");
		userDAO.saveOrUpdate(user);
		 

	}
}
