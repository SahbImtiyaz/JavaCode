package Compiler;

public class InsertionSort 
{
	
	static int step = 1;
	
	public static void main(String[] args) 
	{
		
	        int[] input = { 8, 24, 92, 43, 25, 17, 34, 11, 2 };
	        
	        insertionSort(input);
	 }

	 private static void printNumbers(int[] input) 
	 {

	      System.out.println("Step "+step);
	      System.out.println("-----------------------------");
	      
	      step++;

	        for (int i = 0; i < input.length; i++) 
	        {

	            System.out.print(input[i] + ", ");

	        }

	        System.out.println("\n");
	 }

	 public static void insertionSort(int array[]) 
	 {

	        int n = array.length;

	        for (int j = 1; j < n; j++) 
	        {

	            int key = array[j];
	            int i = j-1;

	            while ( (i > -1) && ( array [i] > key ) ) 
	            {

	                array [i+1] = array [i];
	                i--;

	            }

	            array[i+1] = key;
	            printNumbers(array);
	        }
	 }
}