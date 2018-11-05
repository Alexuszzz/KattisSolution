package javaexercise;

import java.util.Scanner;

public class Ladder {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int degrees = sc.nextInt();
		
		double ladderLength = height/Math.sin(Math.toRadians(degrees));
		
		System.out.println((int)Math.ceil(ladderLength));
		
		

	}

}
