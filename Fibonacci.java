package day1;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0, n2=1, sum=0;
		int num=5;
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++)
		{
			//System.out.println("in loop");
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}

	}

}