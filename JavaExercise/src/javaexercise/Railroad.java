package javaexercise;

import java.util.Scanner;

public class Railroad {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y % 2 ==0) {
			System.out.println("possible");
		}else {
			System.out.println("impossible");
		}
		
		sc.close();
	}

}
