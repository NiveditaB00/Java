package day1;

public class Max_Array {

	public static void main(String[] args) {
		int a[]= {50,30,40,20,60};
		int max = a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element is array : "+max);
		}

	}


