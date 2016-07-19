package com.siri.ShopingCart.product;

public class Employ {
	private int id;
	private String name;
	private Employ manager;
	private Department dept;
	
	
	public Employ(int id, String name) {
		this.id=id;
		this.name=name;
	}


	public Employ getManager() {
		return manager;
	}


	public void setManager(Employ manager) {
		this.manager = manager;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args)
	{
		Employ manager=new Employ(102,"jp");
		Employ clerk=new Employ(105,"krish");
		clerk.setManager(manager);
		Department office=new Department(50,"office");
		clerk.setDept(office);
		disply(clerk);
	}
		
	
		
	


	private static void disply(Employ clerk) {
		// TODO Auto-generated method stub
		System.out.println(clerk.getId());
		System.out.println(clerk.getName());
		System.out.println(clerk.getManager().getName());
		
	}
	
	

}
