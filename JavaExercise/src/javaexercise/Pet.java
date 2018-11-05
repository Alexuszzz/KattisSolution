package javaexercise;

import java.util.Scanner;

public class Pet {
	
	static int sum ;
    static int largescore;
    static int winner;
    
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		for(int i = 1 ; i<6; i++) {
			
				sum = 0; 
			
				for(int x = 1; x<5; x++) {
					sum = sum+ sc.nextInt();			
				}
				
				if(sum > largescore) {
					largescore = sum;					
					winner = i;
				}					
		}
		
		System.out.println(winner +" "+largescore);
		sc.close();
	}

}
