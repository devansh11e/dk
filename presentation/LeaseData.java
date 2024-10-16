package com.hexaware.carrental.presentation;

import java.util.Scanner;

import com.hexaware.carrental.service.ICarLeaseServiceImpl;

public class LeaseData {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		ICarLeaseServiceImpl service=new ICarLeaseServiceImpl();
		System.out.println("***Welcome To Lease Data***");
		System.out.println("1.Add Lease");
		System.out.println("2.Remove Lease");
		System.out.println("3.List All Active Leases");
		System.out.println("4.List of Lease History");
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
