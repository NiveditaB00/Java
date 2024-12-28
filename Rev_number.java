package day1;

import java.util.Scanner;

public class Rev_number {

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse : ");
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		/*
		//Using algorithm
		int rev= 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is : "+rev);

		*/
		
		
		/*
		//Using String buffer
		StringBuffer rev;
		StringBuffer sb =new StringBuffer(String.valueOf(num));
		rev =sb.reverse();
		System.out.println("Reverse number is : "+rev);
		*/
		
		//Using string builder class
		StringBuilder sdl = new StringBuilder();
		sdl.append(num);
		StringBuilder rev = sdl.reverse();
		System.out.println("Reverse number is : "+rev);
		
		
		
	}

}
