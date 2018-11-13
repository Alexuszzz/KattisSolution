package javaexercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {

	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		Set<Integer> numbers = new HashSet<>();
		
		for(int i = 0; i<10;i++) {
			
			int input = sc.nextInt();			
			int modulation = input % 42;		
			numbers.add(modulation);
			
		}
		
		System.out.println(numbers.size());
		sc.close();
	}
	
}
