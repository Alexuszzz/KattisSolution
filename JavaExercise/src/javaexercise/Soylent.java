package javaexercise;

import java.util.Scanner;

public class Soylent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		for(int i = 0; i<testcase; i ++) {
			
			 int calrories = sc.nextInt();
			 System.out.println((int)Math.ceil(calrories/400.0));
		}
	}

}
