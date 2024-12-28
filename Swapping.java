package day1;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping: "+a+" "+b);
		
		/*//Logic1 using 3rd variable 
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping: "+a+" "+b);
		 */
		
		/*//Logic2 using +and - (with out using 3rd variable )
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+a+" "+b);
		*/
		
		
		/*//Logic3 using *and / (with out using 3rd variable ) a and b should not be 0
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping: "+a+" "+b);
		*/
		
		/*//Logic4 using bitwise(XOR ^)
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping: "+a+" "+b);
		*/
		
		//Logic5 Single statement
		b=(a+b-(a=b));
		System.out.println("After swapping: "+a+" "+b);
		
	}

}
