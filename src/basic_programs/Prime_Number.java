package basic_programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number which is to be checked whether it is prime or not ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2; i<=num/2; i++)
		{
			int rem = num%2;
			if(rem==0)
			{
				System.out.println(num + " is not a Prime number ");
				break;
			}
			else
			{
				System.out.println(num + " is a Prime number");
				break;
			}
		}
	}

}
