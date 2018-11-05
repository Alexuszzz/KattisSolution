package javaexercise;

import java.util.Scanner;

public class ADifferentProblem {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
	
		
		  while(sc.hasNext()) {
		
			long firstNo = sc.nextLong();
			long secondNo = sc.nextLong();
			
				
			if(firstNo > secondNo) {
				
				System.out.println(firstNo-secondNo);
			}else {
				
			   System.out.println(secondNo-firstNo);
			}
		  }
		  
		sc.close();
		
		}
	}


