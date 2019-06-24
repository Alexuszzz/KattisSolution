package javaexercise;

import java.util.Scanner;

public class MixedFractions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
		    int den = sc.nextInt();
		
			 if(num == 0 && den == 0) {
				 break;
			}
		System.out.println(num/den + " "+ (num%den) + " / " + den);
		}
			sc.close();
	}

}
