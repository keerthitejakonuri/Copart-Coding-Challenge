package com.copart;

import java.util.Scanner;

public class StringToInteger {
	
	public static int stringToInteger(String s){
		return Integer.valueOf(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s = sc.next();
		System.out.println(stringToInteger(s));
	}

}
