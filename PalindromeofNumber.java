package basicPrograms;

import java.util.Scanner;

public class PalindromeofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		num = sc.nextInt();
		
		
		int rem = 0;
		int rev = 0;
		int temp;
		temp = num;
		
		while(num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		if(temp == rev) 
			System.out.println("Entered number is palindrome");
		
		else 
			System.out.println("Entered number is not Palindrome");
		
		
		sc.close();

	}

}
