package basicPrograms;

import java.util.Scanner;

public class DisplayPrimefrom1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int count;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		number = sc.nextInt();	
		
		for(int i = 2; i <=number; i++) {   // i = 2, i <= 5, i++, i = 3, i <= 5, i++
			count = 0;
			for(int j = 1; j <= i; j++) {   //j = 1, j <= 2, j++, // j = 2 , j <= 2, j++ -- cndn flse, j = 1, j <= 3, j++
				if(i % j == 0) {           // if( 2 % 2 == 0)  if( 3 % 1 == 0)
					count++;              //  count = 1
				}
			}
			if(count == 2) {
				System.out.println(i+" ");
			}
		}
		
		sc.close();
	

	}

}
