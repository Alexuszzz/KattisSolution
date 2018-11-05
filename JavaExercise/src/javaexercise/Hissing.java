package javaexercise;

import java.util.Scanner;

public class Hissing {


	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String text = sc.nextLine();
		String hiss = "ss";
		
		if (text.contains(hiss)) {
			
			System.out.println("hiss");
		
		}else {
			System.out.println("no hiss");
		}

		sc.close();
	}

}
