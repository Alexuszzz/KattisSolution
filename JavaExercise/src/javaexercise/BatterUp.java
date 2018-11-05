package javaexercise;

import java.util.Scanner;

public class BatterUp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int noBats = sc.nextInt();
		int positiveBases = 0;
		double sum = 0; 
		
		for(int i = 0; i<noBats; i++) {
			
			int bases = sc.nextInt();
			
			      if(bases >= 0) {
			    	  positiveBases++;
			    	  sum = sum+bases;
			      }			      			    
		}
	
		System.out.println(sum / positiveBases);  
		
	}

}
