package day1;

public class Rev_String {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev = " ";
		//int len=str.length();
		
		/*
		for(int i=len-1;i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of string : "+rev);
		*/
		
		/*
		//Using char array
		char a[] = str.toCharArray();
		int len=a.length;
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse of string : "+rev);
		*/
		
		//Using string Buffer
		StringBuffer sbr = new StringBuffer(str);
		System.out.println(sbr.reverse());
		

	}

}
