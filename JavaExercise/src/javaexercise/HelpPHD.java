package javaexercise;

import java.util.Scanner;

public class HelpPHD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());		
		
		for(int i = 0; i< cases; i++) {	
	      String input = sc.nextLine();
	      
            if(input.equals("P=NP")) {
            	System.out.println("skipped");
            } else {
            	System.out.println(Integer.parseInt(input.split("\\+")[0]) + Integer.parseInt(input.split("\\+")[1]));
            }
			  							    	
		}
				
	}	
	
}
