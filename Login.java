package com.xworkz.controlStaments;

public class Login {
	public static boolean login(String userName, String password) {
		boolean login;
		String name = "pooja";
		String pwd = "1234";
		if(userName == name && password ==pwd) {
			System.out.println("login successfull");
			login = true;
		
		}
		else
		{
			System.out.println("invalid username and password");
			login = false;
		}
		return login;
		
	}

	public static void main(String[] args) {
	System.out.println(Login.login("pooja", "1234"));

	}

}
