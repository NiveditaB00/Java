package day1;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		long factorial =1;
		/*for(int i=1; i<=num; i++ )
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of a number :  "+factorial);
*/
		
		//in descending order
		for(int i=num; i>=1; i-- )
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of a number :  "+factorial);
		
	}

}
