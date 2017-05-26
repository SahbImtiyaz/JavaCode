package Compiler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3;
		int n, i;
		
		System.out.print("Enter the number of terms for Fibonacci");
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		System.out.println("The Fibonacci series is: ");
		
		System.out.print(n1 +" " +n2 +" ");
		
		for(i =2; i < n; i++)
		{
			
			n3 = n1 + n2;
			
			System.out.print(n3 +" ");
			n1 = n2;
			n2 = n3;
		}
		in.close();

	}

}
