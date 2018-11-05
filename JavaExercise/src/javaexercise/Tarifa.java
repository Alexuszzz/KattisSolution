package javaexercise;

import java.util.Scanner;

public class Tarifa {

	static int sum;
	static int remainSurf;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);       
		
		int fixSurf = sc.nextInt();
		int firstMonths = sc.nextInt();
		
		for(int i = 0 ; i<firstMonths; i++) {
			int numberofMbs = sc.nextInt();
			
			remainSurf= fixSurf - numberofMbs;
			sum = sum+remainSurf;			
		}
		     System.out.println(sum + fixSurf);
		     sc.close();
	}

}
