package javaexercise;

import java.util.Scanner;

public class Zamka {
	
	public static int sumOfDigits(int num) {
		int sum = 0; 
		
			while(num!=0) {
				sum += num%10;
				num = num / 10; 
			}
			
		return  sum; 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
		
			int min = 0; 
			int max = 0; 
			
			for(int i = l; i<=d; i++) {
				if(sumOfDigits(i) == x) {
					min = i;
					break;
				}
			}
			
			for(int i=d; i>=l; i-- ) {
				if(sumOfDigits(i) == x) {
					max = i; 
					break;
				}
			}
			
		System.out.println(min);
		System.out.println(max);
		
	}

}
