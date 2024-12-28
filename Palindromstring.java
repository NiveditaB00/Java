package day1;

import java.util.Scanner;

public class Palindromstring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String str= sc.next();	
		String org_str=str;
		int len = str.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		//System.out.println("Palindrome");

		if(org_str.equals(rev)) {
			
			System.out.println(org_str+" is Palindrome");
			
		}
		else {
			System.out.println(org_str+" Not Palindrome");
		}
	}

}
