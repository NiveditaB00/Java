package day1;

public class Missingelementinarray {
	

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 5};
		
		/*
		 * For approach1 &2
		 * int arr[] = {1, 2, 4, 6, 3, 7, 8};
		int N=arr.length;
		
		 Missingelementinarray(arr, N);
		
		*/
		
		//Approach3
		int sum1=0;
		for(int i=0; i<arr.length; i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("Sum of elemenyts in array : " +sum1);
		
		int sum2 =0;
		for(int i=0; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elemenyts in array : " +sum2);
		
		System.out.println("Missing number : " +(sum2-sum1));
		

	}

	
	//private static void Missingelementinarray(int[] arr, int n) {
		/*
		 * Approach1
		//Creating temp array which is empty
		int temp[] =new int[n+1];
		
		for(int i=0;i<n+1;i++)
		{
			temp[i]=0;
		}
		
		for(int i=0;i<=n-1;i++) {
			temp[arr[i]-1]=1;//it is giving the index of the array
		}
		
		//Checking the 0th element in temp
		int ans=0;
		for(int i=0; i<=n;i++)
		{
			if (temp[i] == 0)
			{
                ans = i + 1;
                break;
			}
		}
		System.out.println(ans);
		*/
		
		/*
		 * Approach 2
		 // Calculate the sum of the first N natural numbers
        int totalSum = n * (n + 1) / 2;
        
        // Calculate the sum of the elements in the given array
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }
        
        // The missing number is the difference between the total sum and the array sum
        int missingNumber = totalSum - arraySum;
        
        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
	}*/
	
	
	
}
