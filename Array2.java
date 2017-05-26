package Compiler;

import java.util.Scanner;

public class Array2 
{

	public static void main(String[] args) 
	{
		
		int [] arr = new int[50];
		int i , n;
		
		System.out.println("Enter the number of elements");

		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for(i = 0; i < n; i++) 
		{
			
			System.out.println("Enter " +(i+1) +" element");
			arr[i]=in.nextInt();
		
		}

		System.out.println("The elements of array are");
		
		for(i = 0; i < n; i++) 
		{
			
			System.out.println(arr[i]);
		
		}
		
		in.close();
	}

}
