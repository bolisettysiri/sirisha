package com.siri.ShopingCart.product;

import java.util.Collections;
import java.util.Comparator;

public class LinkedList {
	public static void main(String[] args) {
		
		java.util.LinkedList<Empl>Linkedlist=new java.util.LinkedList<Empl>();
		 Linkedlist.add(new Empl("Tim", 3000));
		 Linkedlist.add(new Empl("san", 6000));
		 Linkedlist.add(new Empl("kim", 2400));
		 Linkedlist.add(new Empl("rin", 6400));
		Collections.sort(Linkedlist, new MySalaryComp());
		 System.out.println("list");
		 for(Empl e:Linkedlist){
			 System.out.println(e);
		 }
		 
		 
		}
				
		}
		class MySalaryComp implements Comparator<Empl>{
			public int compare(Empl e1,Empl e2)
			{
				if(e1.getSalary()<e2.getSalary()){
					return 1;
				}
				else{
					return -1;
				}
				
			}
		}
		class Empl
		{
			private String name;
			private int salary;
			public Empl(String n,int s)
			{
				this.name=n;
				this.salary=s;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}	
		public String toString(){
			
		return "Name: "+this.name +"--salary: "+this.salary;
		}


}
