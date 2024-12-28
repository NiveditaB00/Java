package day1;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum = 0;
		/*for(int i=0; i<=a.length-1; i++ )//0 1 2 3 4  //a.length =5 
		{
			sum = sum + a[i];
		}
		*/
		
		//ENhanced for loop
		for(int value:a)
		{
			sum = sum + value;
		}
		System.out.println("Sum of the array : "+sum );

	}

}
