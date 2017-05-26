package Compiler;

import java.util.Scanner;

public class Do_While_loop 
{

	public static void main(String[] args) 
	{
		int i;
		int fact = 1;
		int num;
		System.out.print("Enter the number for factorial \n");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		i = num;
		do
		{
			fact = fact * i;
			i = i - 1;
		}while(i > 0);
		System.out.print("Factorial of " +num +" =: " + fact);
		in.close();

	}

}
