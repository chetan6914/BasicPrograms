package basic_programs;

import java.util.Scanner;

public class Buzz_Fizz {
	
	{
		System.out.println("Static block before main method");
	}

	public static void main(String[] args) {
		
		String res = "";
		int num = 0;
		System.out.println("Enter the number to check whether divisible by three and 5 or both : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%3==0)
		{
			res = res + "Three ";
		}
		if(num%5==0)
		{
			res = res + "Five";
		}
		
		System.out.println(res);

	}

}
