package javaexercise;

import java.util.Scanner;

public class ReverseAnInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 1534236469; 
		
		int reverse = 0; 
		
		while(input != 0) {
			int digit = input% 10; 
			
				reverse = reverse*10 + digit; 
			
				input = input/10; 
		}
		
		System.out.println(reverse);
		sc.close();

	}

}
