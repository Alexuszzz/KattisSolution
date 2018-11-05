package javaexercise;

import java.util.Scanner;

public class QuadrantSelection {   

	public static void main(String[] args) { 
		
		Scanner s  = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		s.close();
		
		if(x <= 1000 && x>0 && y<= 1000 &&  y>0 ) {
			
			System.out.println(1);
			
		}else if(x <0 && x>=-1000 && y<= 1000 && y>0 ) {
			
			System.out.println(2);
			
		}else if(x <0 && x>=-1000 && y<0 && y>=-1000) {
			
			System.out.println(3);
			
		}else if(x <= 1000 && x>0 && y<0 && y>=-1000) {
			
			System.out.println(4);
		}
		

	}

}
