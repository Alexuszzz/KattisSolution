package javaexercise;

import java.util.Scanner;

public class Cold_puterScience {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTempretures = sc.nextInt();
		int acc = 0;
		int tempreture=0;
			
		for(int i = 0; i < noOfTempretures; i++){
			
			tempreture = sc.nextInt();
			
			if(tempreture < 0){
				
				acc++;
		    }
		
	    }
       System.out.println(acc);
   }
}
