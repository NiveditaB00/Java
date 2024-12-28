package day1;

public class Countnumers {

	public static void main(String[] args) {
		int num=1234500;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("the total numbers are : "+count);

	}

}
