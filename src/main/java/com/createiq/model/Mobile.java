package com.createiq.model;

public class Mobile {
	
	public static void main(String[] args) {
//		Airtel airtel= new Airtel();
//		airtel.airtelCalls();
//		airtel.airtelData();
//		airtel.airtelSms();
//		System.out.println("--------------");
//		Jio jio = new Jio();
//		jio.jioCalls();
//		jio.jioData();
//		jio.jioSms();
		
	
	Network network = new Jio();
	Network network1 = new Airtel();
		network.calls();
		network.data();
		network.sms();
		System.out.println("------------");
		network1.calls();
		network1.data();
		network1.sms();
	
	}

}
