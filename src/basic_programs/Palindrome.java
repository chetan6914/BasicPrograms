package basic_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String original = "";
		String reverse = "";
		
		System.out.println("Enter the String you want to check ");
		Scanner sc = new Scanner(System.in);
		
		original = sc.nextLine();
		
		int length_of_string = original.length();
		
		String[] split_and_Store = original.split("");
		
		System.out.println("Printing and storing the array in reverse : ");
		
		for(int i = length_of_string - 1; i>=0; i--)
		{
			System.out.print(split_and_Store[i]);
			reverse = reverse + split_and_Store[i];			
		}
		
		System.out.println();
		System.out.println("Checking whether reverse and original strig is equal or not ");
		
		if(original.equals(reverse))
		{
			System.out.println(original + " is Palindrome");
		}
		else
		{
			System.out.println(original +  " is not a Palindrome");
		}
	}

}
