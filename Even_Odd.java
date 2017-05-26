package Compiler;
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter a number to Check weather it is even or add\n");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		
		if(x % 2 == 0)
			System.out.println("Number is Even " + x);
		else
			System.out.println("Number is odd " + x);
		in.close();

	}

}
