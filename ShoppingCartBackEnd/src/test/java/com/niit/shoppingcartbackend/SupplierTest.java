package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCart.Model.Supplier;

import com.niit.ShoppingCart.dao.SupplierDAO;


public class SupplierTest {
	public static void main(String[] args){
		@SuppressWarnings("resource")
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("com.niit.Shoppingcart");
context.refresh();
SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier=(Supplier)context.getBean("supplier");
		supplier.setId("CG120");
		supplier.setName("CG Name120");
		supplier.setAddress("CG Desc120");
		supplierDAO.saveOrUpdate(supplier);
		 

}
}