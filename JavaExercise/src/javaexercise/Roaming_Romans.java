package javaexercise;

import java.util.Scanner;

public class Roaming_Romans {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		double mile = sc.nextDouble();
		
		double roman = (mile*(double)5280 / 4854)*1000;
			
		System.out.println(Math.round(roman));
		
		sc.close();

	}

}
