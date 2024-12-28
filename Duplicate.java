package day1;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		String arr[] = {"java", "c++", "C#", "Python", };
		
		/*
		//Approach1
		boolean flag =false;
		for(int i=0; i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found the dublicate : "+ arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) 
		{
			System.out.println("Not found duplicate");
		}
		*/
		
		//Approach2 Hashset
		boolean flag = false;
		HashSet <String>langs = new HashSet();
		//hashset won't allow to the duplicates
		
		/*
		System.out.println(langs.add("java"));
		System.out.println(langs.add("Python"));
		System.out.println(langs.add("java"));
		*/
		
		for(String l:arr)//asgining the arr value to l
		{
			if(langs.add(l)==false) //assining the l value to the langs and checking for duplicate
			{
				System.out.println("Found the dublicate : "+l);
				flag=true;
			}
		}
		if(flag==false) 
		{
			System.out.println("Not found duplicate");
		}
		

	}

}
