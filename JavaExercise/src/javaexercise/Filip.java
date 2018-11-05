package javaexercise;

import java.util.Scanner;

public class Filip {
        
	    
	public static void main(String[] args) {
	    int max = 0;
		int rValue = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<2; i++) {
			
			String reverse  = new StringBuffer(sc.next()).reverse().toString();	 
			
			 rValue = Integer.parseInt(reverse);
			  		
					if(rValue > max) {
						max = rValue;					
					}else {
						rValue = max;
					}			
		}		
		System.out.println(rValue);	
		sc.close();
	}	
	    		
}   
	 
	   


