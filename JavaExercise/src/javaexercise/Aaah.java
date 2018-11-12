package javaexercise;

import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String jon = sc.next();
		String doctor = sc.next();
		
		if(jon.length()>=doctor.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		
        sc.close();
	}

}
