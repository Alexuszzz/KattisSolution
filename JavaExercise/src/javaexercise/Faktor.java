package javaexercise;

import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int articles = sc.nextInt();
		int faktor = sc.nextInt();
		
		sc.close();
		
		int scientists = articles*(faktor-1)+1;
		System.out.println(scientists);
	}
    
	 
}
