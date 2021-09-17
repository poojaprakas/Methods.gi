package com.xworkz.controlStaments;

public class LocalTrain {
	public static String chennaiExpress(int Train1, String time) {
		return "Chennai Express Arrives at" +time + "train number "+ Train1;
	}
	public static String ticketBooking(int seatnumber,String compartment) {
		return compartment + "compartment and seat number"+ seatnumber;
	}

	public static void main(String[] args) {
	String chennaiExpress = LocalTrain.chennaiExpress(187," 8AM");
	System.out.println(chennaiExpress);
	String ticketBooking = LocalTrain.ticketBooking(11, "B12");
	System.out.println(ticketBooking);
	

	}

}
