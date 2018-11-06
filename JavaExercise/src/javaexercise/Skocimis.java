package javaexercise;

import java.util.Scanner;

public class Skocimis {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int kangarooA = sc.nextInt();
		int kangarooB = sc.nextInt();
		int kangarooC = sc.nextInt();
		
		System.out.println(Math.max(kangarooB-kangarooA-1, kangarooC-kangarooB-1));
		

	}

}
