package javaexercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PokerHandMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> cardHist = new HashMap<>();
		  
		char [] cards = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};   
				
		   for(Character ch: cards) {
			   cardHist.put(ch, 0);
		   }
		   
		   for(int i=0;i<5;i++) {

				String card = sc.next();
				
				int occurring = cardHist.get(card.charAt(0));
				  
				cardHist.put(card.charAt(0),occurring+1);
				 // System.out.println(card);
			}

		   System.out.println(Collections.max(cardHist.values()));
	}

}
