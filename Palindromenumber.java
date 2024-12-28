package day1;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		System.out.println( "Enter the number");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int org_num = num;
		int rev=0;
		
		System.out.println( "Entring the while");
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		System.out.println(rev+ " revrce number");
		if(org_num == rev )
		{
			System.out.println(org_num+ " Palindrom");
		}
		else
		{
			System.out.println(org_num+ "Not Palindrom");
		}

	}

}
