package javaexercise;

import java.util.Scanner;

public class Apaxian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String names = sc.next(); 
		
		for(int i = 0; i<names.length();i++) {
			
			if(i == (names.length())-1||names.charAt(i)!= names.charAt(i+1)) {
				System.out.print(names.charAt(i));
			}
			
		
			}
		}

	}


