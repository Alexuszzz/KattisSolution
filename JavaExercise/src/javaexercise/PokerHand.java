package javaexercise;

import java.util.Arrays;
import java.util.Scanner;

public class PokerHand {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char [] card = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
		int [] counter = new int[13];


		for(int i=0;i<5;i++) {

			String cards = sc.next();

			for(int j = 0; j<13; j++)  {

				if(card[j] == cards.charAt(0)) {
					counter[j]++;				   
				}	  
			}
		}
		Arrays.sort(counter);
		System.out.println(counter[12]); 		
	}
}	    		


