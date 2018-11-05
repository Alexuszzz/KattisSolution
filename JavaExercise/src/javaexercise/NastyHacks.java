package javaexercise;

import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int count = sc.nextInt();
			
	    for(int i = 0; i<count; i++) {
		
	    int noAdv = sc.nextInt();
		int Adv = sc.nextInt();
		int cost = sc.nextInt();
	
	    if((Adv-cost)>noAdv) {
	    	System.out.println("advertise");
	    }else if((Adv-cost)<noAdv) {
	    	System.out.println("do not advertise");	    
	    }else {
	    	System.out.println("does not matter");
	    }
	 
    }
}
}
