package javaexercise;

import java.util.Scanner;

public class R2 {


	public static void main(String[] args) {
		
		Scanner number  = new Scanner(System.in);
		int r1 = number.nextInt();
		int s1 = number.nextInt();
		number.close();
		
		int r2 = s1*2-r1;
		
		System.out.println(r2);

	}

}
