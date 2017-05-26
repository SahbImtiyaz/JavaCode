package Compiler;

import java.util.Scanner;

public class Switch_Case
{

	public static void main(String[] args)
	{
		
		String a;
		
		System.out.print("Enter the grade form (A to E) & Dist for distinction : \n");
		Scanner in = new Scanner(System.in);
		
		a = in.next();
		
		switch(a)
		{
		
		case "Dist": System.out.println("Distiontion : Marks between(100 to 90)");
		break;
		
		case "A": System.out.println("Grade A : Marks between(89 to 70)");
		break;
		
		case "B": System.out.println("Grade B : Marks between(69 to 55)");
		break;
		
		case "C": System.out.println("Grade C : Marks between(54 to 49)");
		break;
		
		case "D": System.out.println("Grade D : Marks between(48 to 40)");
		break;
		
		case "E": System.out.println("Grade E : Failed marks below(40)");
		break;
		
		default:System.out.println("Enter a valid grade");
		
		}
		
		in.close();

	}

}
