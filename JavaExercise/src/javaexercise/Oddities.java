package javaexercise;

import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		
		Scanner numbers =  new Scanner(System.in);
		
		int testcases = numbers.nextInt();
		
		int[] arr = new int[testcases];
		 
		for (int i = 0; i < testcases; i++) {
			arr[i] = numbers.nextInt();
		}
		 
		//System.out.println(Arrays.toString(arr));
		for(int i =0; i < testcases; i++) {
			
			//int x = numbers.nextInt();
	
		   if((arr[i]%2)==0 ) {
				 
				 System.out.println(arr[i]+" is even");
			 }else {
				 System.out.println(arr[i]+" is odd"); 
			 }
		} 
			
		numbers.close();
		   
		   
		}
	}

