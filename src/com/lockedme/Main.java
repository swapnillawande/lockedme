package com.lockedme;

import java.util.Date;
import java.util.*;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		FileClass fc = new FileClass();
		
		try {
			
			boolean val = true;
			int num;
			int num2;
			 
			while(val) {
				
				 num = displayMenu1();
 
				switch(num) {
					
					case 1:
						// get all files
						fc.getFilesInAccendingOrder();
						break;
						
					case 2:
						// get all operations
						boolean val2 = true;
						
						try {
							while(val2) {
								
								num2 = displayMenu2();
								
								switch(num2) {
								
								case 1:
									fc.createFile();
									break;
									
								case 2:
									fc.deleteFile();
									break;
									
								case 3:
									fc.searchFile();
									break;
									
								case 4:
									fc.getFilesInAccendingOrder();
									break;
									
								case 5:
									val2=false;
									break;
									
								default :
									System.out.println("Invalid Input..");
								}
								
								
							}
						}catch(Exception e) {
							System.out.println("Invalid Input..");
						}
 
						break;
						
					case 3:
						// exit
						System.out.println("Bye have a good day !");
						val = false;
						break;
						
					case 4:
						System.out.println("------------------------------------------------------------");
						System.out.println("Application developed by : Swapnil Lawande");
						System.out.println("Email : swapnillawande8@gmail.com");
						System.out.println("Linkedin : http://www.linkedin.com/in/swapnil-lawande-3a952719b");
						System.out.println("This application is usefull to manage the system files");
						System.out.println("------------------------------------------------------------");

						break;
						
					default:
						System.out.println("Invalid Input..");
					
				
				}
	 	
			}
			
		}catch(InputMismatchException e) {
			System.out.println("Enter a valid input..");
			 
		}
 
	}
	
	public static int displayMenu1() {
		try {
			int num ;
			Date date = new Date();
			System.out.println("\n\t  "+date.toGMTString());
			System.out.println("--------- Welcome to LockedMe.com ----------\n");
			System.out.println("1.Retrive All Files");
			System.out.println("2.Operations");
			System.out.println("3.Exit");
			System.out.println("4.About");
			System.out.println("Enter your choice = ");
			num = sc.nextInt();
			return num ;
		}catch(Exception e) {
			System.out.println("Enter a valid input and try again ..");
			return 3;
		}
		 
	}
	
	public static int displayMenu2() {
		try {
			int num ;
			System.out.println("\n1.Create File");
			System.out.println("2.Delete File");
			System.out.println("3.Search File");
			System.out.println("4.Get all files in Accending Order");
			System.out.println("5.Back to Main Menu");
			System.out.println("Enter your choice = ");
			num = sc.nextInt();
			return num ;
		}catch(Exception e) {
			System.out.println("Enter a valid input and try again ..");
			return 5;
		}
	}
	
 

}
