package day1;

public class Prime_num {

	public static void main(String[] args) {
		int num =-1;
		int count =0;
		if(num>0) 
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				count++;
				System.out.println(count);
			}
			if(count==2) {
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not Prime number");
			}
		}
		else
		{
			System.out.println("Not a Prime number");
		}

	}

}
