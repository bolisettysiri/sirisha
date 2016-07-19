package com.siri.ShopingCart.product;

public class Product {
	private String id;
	private String Name;
	private double price;
 
	
  


	public Product(String id, String Name, double price) {
		this.id=id;
		this.Name=Name;
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	
}
