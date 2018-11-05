package javaexercise;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		StringBuffer sb = new StringBuffer();
		
		String name= sc.next();
		
		String [] namesWithHaven = name.split("-");
		
		for(String part : namesWithHaven) {
			sb.append(part.charAt(0));
		}
			
			System.out.println(sb.toString());
		sc.close();

	}

}

