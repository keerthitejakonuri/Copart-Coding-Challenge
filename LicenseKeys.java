package com.copart;

import java.util.Scanner;

public class LicenseKeys {

	public static String decode(String s, int k){
		String temp = new String();
		s = s.replaceAll("-", "").toUpperCase().trim();
		int c = 0;
		for(int i = s.length() - 1; i >= 0; i--){
			if(' '!=s.charAt(i)){
				c++;
				temp = Character.toString(s.charAt(i))+temp;
				if(c == k){
					c = 0;
					if(i != 0)
					temp = Character.toString('-')+temp;
				}
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter any String");
		String s = sc.nextLine();
		System.out.println("Enter any Integer:");
		int k = sc.nextInt();
		System.out.println(decode(s,k));
	}

}
