package javaexercise;

import java.util.Scanner;

public class Bela {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hands = sc.nextInt();
		String dominant = sc.next();	

		int points = 0; 

		int [] d = {11, 4, 3, 20, 10, 14};
		int [] nd = {11, 4, 3, 2, 10, 0};

		for(int i = 0; i<hands*4; i++ ) {

			String card_Suit = sc.next();
			String val = card_Suit.substring(0,1);
			String suit = card_Suit.substring(1);

			if(val.equals("A")) {

				points += nd[0];

			}else if(val.equals("K")) {

				points += nd[1];

			}else if(val.equals("Q")) {
				
				points += nd[2];
			}
			
			if(val.equals("J") && suit.equals(dominant)) {

				points += d[3];

			}else if(val.equals("J")){

				points += nd[3];

			}else if(val.equals("T")) {

				points += nd[4];

			}else if(val.equals("9") && suit.equals(dominant)) {

				points += d[5];		               
			}
		}
	System.out.println(points);
	sc.close();
	}
}

