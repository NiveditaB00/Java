package day1;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,40,50,30};
		
		int search_ele = 150;
		
		boolean flag = false;
		for(int i=0; i<a.length;i++) {
			if(search_ele==a[i])
			{
				System.out.println("element found " +a[i]+" "+i);
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("element not found");
		}
		

	}

}
