package com.hexaware.carrental.presentation;

import java.util.Scanner;

import com.hexaware.carrental.service.ICarLeaseServiceImpl;

public class VehicleData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		ICarLeaseServiceImpl service=new ICarLeaseServiceImpl();
		System.out.println("***Welcome To Vehicle Data***");
		System.out.println("1.Add Car");
		System.out.println("2.Remove Car");
		System.out.println("3.List of Available Cars");
		System.out.println("4.List of Rented Cars");
		System.out.println("5.Find Car by VehicleID");
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
		case 5:
			break;
		default:System.out.println("Invalid Choice");
	     break;
		
		}
	
	}
}
