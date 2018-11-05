package javaexercise;

import java.util.Scanner;

public class ProblemA {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			
			String lineOfText = sc.nextLine();
			
			String problem = "problem";
			
			if (lineOfText.toLowerCase().contains(problem)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
		sc.close();

	}

}
