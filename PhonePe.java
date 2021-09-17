package com.xworkz.controlStaments;

import com.sun.management.OperatingSystemMXBean;

public class PhonePe {
	public static String mobileRecharge(long phonenumber, int plan) {
		return "you have succesfully recharge to" +phonenumber;
	}
		
		public static String payToContact (String Name, long phoneno) {
			return "transaction successfully done to contact" +phoneno;
		}
			
			public static String payToAccount(String Accountnumber, String IFSC) {
				return "transaction successfully done to account" + Accountnumber;
			}
			public static String balanceCheck(int amount, int UPI) {
				return " your balance is " +amount;
			}
			public static String payToSelf (String Name, long phoneno) {
				return "transaction successfully done to myself" +phoneno;
			}
			public static String dthRecharge(String name, int no) {
				return" you have successfully recharge tata sky" +no;
			}
		public static void main(String[] args) {
			String mobileRecharge = PhonePe.mobileRecharge(9740889056L, 200);
			System.out.println(mobileRecharge);
			String balanceCheck = PhonePe.balanceCheck(2000, 4567);
			System.out.println(balanceCheck);
			
		}
}
			

