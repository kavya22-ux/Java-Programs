package basicPrograms;

import java.util.Scanner;

public class DisplayonlyOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		number = sc.nextInt();
		
		for(int i=0; i < number; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
