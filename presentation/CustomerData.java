package com.hexaware.carrental.presentation;

import java.util.Scanner;

import com.hexaware.carrental.service.ICarLeaseServiceImpl;

public class CustomerData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		ICarLeaseServiceImpl service=new ICarLeaseServiceImpl();
		System.out.println("***Welcome To Customer Data***");
		System.out.println("1.Add Customer");
		System.out.println("2.Remove Customer");
		System.out.println("3.List All Customers");
		System.out.println("4.Find by Customer ID");
		int choice1=scanner.nextInt();
		switch(choice1)
		{ case 1: 
			 break;
		case 2: 
			 break;
		case 3: 
			 break;
		case 4:
			break;
		default:System.out.println("Invalid Choice");
	     break;
		
		}
	
	}

}
