package javaexercise;

import java.util.Scanner;

public class SevenWonders {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tablet = 0;
		int gear = 0;
		int compass = 0;
		
		int fewest = 0;
		
		String cards = sc.next();
		
		for(int i = 0; i<cards.length();i++) {

			if(cards.charAt(i) == 'T') {
					tablet++;
					
			}else if (cards.charAt(i) == 'G') {
					compass++;
					
			}else {
					gear++;
			}
		}
		
		if(tablet<= compass && tablet<= gear) {
			fewest = tablet;
			
		}else if(compass <= gear) {
			fewest = compass;
			
		}else {
			fewest = gear;
		}
		
		  tablet = tablet*tablet;
		  compass = compass*compass;
		  gear = gear*gear;
		  
		  fewest=7*fewest;
		  
		 System.out.println(fewest+tablet+compass+gear);
		 
		

	}
	
	
	

}
