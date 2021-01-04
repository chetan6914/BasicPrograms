package basic_programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		System.out.println("Enter the number till you want to print Fibonacci series : ");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		for(int i = 1; i <=num; i++)
		{
			if(i==1)
				System.out.print("Fibonacci series is : "  + a );
			 a = b;
			 b = c;
			c = a + b;
			System.out.print("  " + c);
		}
		
	}

}
