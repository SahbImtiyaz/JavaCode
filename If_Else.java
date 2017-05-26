package Compiler;

import java.util.Scanner;

public class If_Else 
{

	public static void main(String[] args) 
	{
		
		int a, b, c;
		
		System.out.print("Enter the three numbers \n");
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if(a > b && a > c)
		{
			
			System.out.print("A is Greater : " +a);
			
		}
		else if(b > a && b > c)
		{
			
			System.out.print("B is Greater : " +b);
			
		}
		else
		{
			
			System.out.print("C is Greater : "+c);
			
		}
		
		in.close();
		

	}

}
