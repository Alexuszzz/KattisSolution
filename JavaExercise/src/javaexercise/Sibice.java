package javaexercise;

import java.util.Scanner;

public class Sibice {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int matches = sc.nextInt();
        
		int width = sc.nextInt();
		
		int height = sc.nextInt();	
		
		double x = Math.sqrt(width*width+height*height);
		
		for(int i  = 0; i<matches; i++) {
					
				if(sc.nextInt() > x){
				
				System.out.println("NE");
				
			}else {
				
				System.out.println("DA");
			}			
			
		}

	}

}
