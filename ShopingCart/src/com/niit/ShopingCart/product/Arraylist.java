package com.niit.ShopingCart.product;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] aa)
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("java");
		a1.add("c++");
		a1.add("PERL");
		a1.add("BASIC");
		System.out.println(a1);
		System.out.println("Does this list contains Java"+ a1.contains("Java"));
		a1.add(2,"COBOL");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}

}
