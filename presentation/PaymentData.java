package com.hexaware.carrental.presentation;

import java.util.Scanner;

import com.hexaware.carrental.service.ICarLeaseServiceImpl;

public class PaymentData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		ICarLeaseServiceImpl service=new ICarLeaseServiceImpl();
		System.out.println("***Welcome To Payment Data***");
		System.out.println("1.Record Payment");
		int choice1=scanner.nextInt();
		switch(choice1)
		{ case 1: 
			 break;
		default:System.out.println("Invalid Choice");
	         break;
		
		}
	
	}
}
