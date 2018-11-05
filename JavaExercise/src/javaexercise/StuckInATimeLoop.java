package javaexercise;

import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		
		Scanner magicnumber  = new Scanner(System.in);
		int count = magicnumber.nextInt();
		magicnumber.close();
		
		
		for(int i=1; i<count+1; i++) {
		 
			System.out.println(i + " Abracadabra");

		}

	}
	
}
