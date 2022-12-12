package testing;

import java.util.Scanner;

public class DummyProject {
	
	// using recursion for printing all permutation 
	// NEW CODE
	static void printAllPermutn(String str, String ans)
	{
		 
		// When the string is empty print the ans
		// Base condition
		
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		// Iterating through the string from start to end 
		// Main recursion code
		
		for (int i = 0; i < str.length(); i++) {

			// Taking the ith index char 
			char ch = str.charAt(i);

			// storing the remaining string in ros
			
			String rem = str.substring(0, i) + str.substring(i + 1);

			// calling the recursion function 
			
			printAllPermutn(rem, ans + ch);
		}
	}

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		// taking string as input
		
		String str=sc.nextLine();
		
		// calling the recursion function on given string 
		
		printAllPermutn(str, "");
	
	}
}
