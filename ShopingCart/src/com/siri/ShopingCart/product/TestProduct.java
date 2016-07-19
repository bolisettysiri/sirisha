package com.siri.ShopingCart.product;

import java.util.ArrayList;

public class TestProduct 
{



	  public static void main(String[] args)
		{
			ArrayList<Product> products=new ArrayList<Product>();
		    Product p=new Product("PRD1","Dell laptop",50000);
		    products.add(p);
		    Product p1=new Product("PRD2","i Phone",50000);
		    products.add(p1);
		    Product p2 =new Product("PRD3","i Phone6s",60000);
		    products.add(p2);
		    for(Product P4:products)
		    {
		    	System.out.println(P4.getId());
		    	System.out.println(P4.getName());
		    	System.out.println(P4.getPrice());
		  
		    
			
		
	}
	
	
	
		}
}
