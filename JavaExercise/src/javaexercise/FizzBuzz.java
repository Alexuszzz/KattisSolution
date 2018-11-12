package javaexercise;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int modulaA = sc.nextInt(); 
		int modulaB = sc.nextInt(); 
		
		int n = sc.nextInt();
		
		for(int i  = 1; i<n+1; i++) {
			
			if(i%modulaA == 0 && i % modulaB ==0) {
				
				System.out.println("FizzBuzz");
				
			}else if(i%modulaA == 0) {
				
				System.out.println("Fizz");
				
			}else if(i%modulaB == 0){
				
				System.out.println("Buzz");
				
			}else {
				System.out.println(i);
			}
						
		}
		
		sc.close();

	}

}
