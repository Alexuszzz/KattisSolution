package javaexercise;

import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		
		Scanner stone  = new Scanner(System.in);
		int total = stone.nextInt();
		stone.close();
		
		if((total%2) == 0) {
			System.out.println("Bob");
				
		}else {
		   System.out.println("Alice");
		}
		
		
	}

}
