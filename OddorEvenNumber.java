package basicPrograms;

import java.util.Scanner;

public class OddorEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Given Number is even");
		}
		else {
			System.out.println("Given Nuumber is odd");
		}
		sc.close();

	}

}
