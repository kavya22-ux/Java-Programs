package basicPrograms;

import java.util.Scanner;

public class CheckNumberisPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		number = sc.nextInt();	
		
		if(number <= 1) {
			flag = 1;
		}
		
		for(int i = 2; i < number/2; i++) {
			if(number % i == 0) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println("Eneterd number is prime");
		}
		else {
			System.out.println("Entered number is not a prime");
		}
			
		sc.close();

	}

}
