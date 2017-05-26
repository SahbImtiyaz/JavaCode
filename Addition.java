package Compiler;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a , b;
		System.out.println("Enter first number");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		System.out.println("Enter the second number");
		b = in.nextInt();
		System.out.println("Addition=" + (a+b));
		in.close();
	}

}
