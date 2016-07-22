package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart.Model.Product;
import com.niit.ShoppingCart.Model.Supplier;
import com.niit.ShoppingCart.dao.ProductDAO;
import com.niit.ShoppingCart.dao.SupplierDAO;

public class ProductTest {
	public static void main(String[] args){
		@SuppressWarnings("resource")
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com.niit.Shoppingcart");
context.refresh();
ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		Product product=(Product)context.getBean("product");
		product.setId("CG120");
		product.setName("CG Name120");
		product.setDescription("CG desc120");
		product.setPrice(5000);;
		productDAO.saveOrUpdate(product);
		 
	}
}
