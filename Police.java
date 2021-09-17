package com.xworkz.controlStaments;

public class Police {
	public static int Salary(int hours,int perday) {
	int permonth = hours*perday;
	return permonth;
	}

	public static void main(String[] args) {
		int hours = 17;
		int perday = 2500;
		int totalamount;
		totalamount = Police.Salary(17, 2500);
		System.out.println(totalamount);

	}

}
