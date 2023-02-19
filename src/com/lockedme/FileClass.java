package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class FileClass {

	public static Scanner sc = new Scanner(System.in);
	
	public void createFile() {
		try {
			String fileName ;
			System.out.println("Enter file name = ");
			fileName = sc.next();
			fileName = fileName.toLowerCase();
			
			File fileObj = new File ("C://SampleFiles//"+fileName);
			
			if(fileObj.exists()) {
				System.out.println("File already exists can't create");
				return;
			}else {
				fileObj.createNewFile();
				System.out.println("File created successfully !");
			}
			
			 
			
		}catch(Exception e) {
			System.out.println("Error please try again");
		}
	}
	
	public void deleteFile() {
		try {
			String fileName ;
			System.out.println("Enter file name to delete = ");
			fileName = sc.next();
			fileName = fileName.toLowerCase();

			File fileObj = new File ("C://SampleFiles//"+fileName);
			
			if(fileObj.exists()) {
				fileObj.delete();
				System.out.println("File successfully deleted !");
				return;
			}else {
				 
				System.out.println("File not present");
			}
 	 
			
		}catch(Exception e) {
			System.out.println("Error please try again");
		}
	}
	
	public void searchFile() {
		
		try {
			String fileName ;
			System.out.println("Enter file name to search = ");
			fileName = sc.next();
			fileName = fileName.toLowerCase();

			
			File fileObj = new File ("C://SampleFiles");
			String[] arr = fileObj.list();
			
			for(String i: arr) {
				if(i.equals(fileName)) {
					System.out.println("File found !");
					return;
				}
			}
			System.out.println("File not found..");


			
		}catch(Exception e) {
			System.out.println("Error please try again");
		}
	}
	
	public void getFilesInAccendingOrder() {
		try {
 		
			File fileObj = new File ("C://SampleFiles");
			
			String[] arr = fileObj.list();
			String temp="";
			int n = arr.length;
	        for (int j = 0; j < n - 1; j++) {
	            for (int i = j + 1; i < n; i++) {
	                if (arr[j].compareTo(arr[i]) > 0) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	        System.out.println("-------------------------------");
	        for(String i :arr)
	        {
	        	System.out.println(i);
	        }
	        System.out.println("-------------------------------");
			
 
			
		}catch(Exception e) {
			System.out.println("Error please try again");
		}
	}
	
	
}
