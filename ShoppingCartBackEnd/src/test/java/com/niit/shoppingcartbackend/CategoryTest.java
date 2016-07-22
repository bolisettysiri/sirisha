package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart.Model.Category;
import com.niit.ShoppingCart.dao.CategoryDAO;

public class CategoryTest {

		public static void main(String[] args){
			@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.Shoppingcart");
	context.refresh();
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
			Category category=(Category)context.getBean("category");
			category.setId("CG120");
			category.setName("CG Name120");
			category.setDescription("CG Desc120");
			categoryDAO.saveOrUpdate(category);
			
			
			
		}
			
			
			
		}
		


