package Compiler;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int a , b , i , res;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number for table");
		a=in.nextInt();
		
		System.out.println("Enter the number of terms to be generated");
		b=in.nextInt();
		
		for(i = 1 ; i <= b ; i++)
		{
			
			res=a*i;
			System.out.println(+a +"*" +i +"=" +res);
			
		}
		
		in.close();
	}

}
