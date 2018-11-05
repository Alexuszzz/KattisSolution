package javaexercise;

import java.util.Scanner;

public class CryptographerConundrum {
	
	static int days = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cryp = sc.next();	
		String [] code = cryp.split("");
		
		
		String p = "PER";
		String [] per = p.split("");
				
		for(int i= 0; i<cryp.length(); i++) {
				
			if(!code[i].equals(per[i % 3]))
				days++;		 
		} 
		
	      System.out.print(days);
	
	}
}
