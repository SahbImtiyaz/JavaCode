package Compiler;

import java.util.Scanner;

public class Sort_Array 
{

	public static void main(String[] args) 
	{
		
		int[] arr = new int[20];
		int n, temp, i, j;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");

		n = in.nextInt();

		for(i = 0; i < n; i++) 
		{
			
			System.out.println("Enter element" +(i+1) +" :");
			arr[i] = in.nextInt();

		}
		
		System.out.println("Array Before Sorting is :");
		
		for(i = 0; i < n; i++) 
		{
			
			System.out.println(+arr[i]);
		
		}
		
		for(i = 0; i < (n-1); i++) 
		{
			
			for(j = (i+1); j < n; j++) 
			{
		
				if(arr[i] >= arr[j]) 
				{
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				}
				
			}	
		
		}
		
		System.out.println("Array after sorting is :");
		
		for(i = 0; i < n; i++) 
		{
			
			System.out.println(arr[i]);
		
		}
		
		in.close();

	}

}
