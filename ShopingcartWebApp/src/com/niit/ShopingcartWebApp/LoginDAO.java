package com.niit.ShopingcartWebApp;

public class LoginDAO {
	public static boolean isValidUser(String userId,String password)
	{
		if(userId.equals(password))
				{
			return true;
				}
		else
		{
			return false;
			
				}
		
	}

}
