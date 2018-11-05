package javaexercise;

import java.util.Scanner;

public class Planina {

	public static void main(String[] args) {
		
		Scanner planina = new Scanner(System.in);
		
		int numberofIteration = planina.nextInt();
		
		int numberofPoints = (int)Math.pow(2, numberofIteration) +1;
		
		int totalPoints = (int)Math.pow(numberofPoints, 2);
		
		planina.close();
		
		
		System.out.println(totalPoints);
	}

}
