package day1;

public class Prime_N_Numbers {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			int count=0;// here only we have to initilize the count to reset for every ith value(count is reset to 0 for each value of i.)
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				//System.out.println("Hey");
				
			}
		}

	}

}
