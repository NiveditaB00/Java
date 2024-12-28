package day1;

import java.util.Arrays;

public class ArrayEqual_Not {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		//Approach 1
		/*boolean status =Arrays.equals(a1, a2);
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays not are equal");
		}
		*/
		
		
		//Approach 2
		//both array should have same length
		boolean status = true;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i] != a2[i]);
			}
		}
		else
		{
			status = false;
		}
		if(status==true) 
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays not are equal");
		}

	}

}
