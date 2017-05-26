package Compiler;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i,n, fact= 1;
		System.out.println("Enter a number for factorial");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if(n<=0)
			System.out.println("Number should b positive and greater than 1");
		else{
		for (i = 1 ; i <= n ; i ++)
		{
			fact=fact * i;
		}
		}
		System.out.println(fact);
		in.close();

	}

}
