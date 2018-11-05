package javaexercise;

import java.math.BigInteger;
import java.util.Scanner;


public class Pot {

	public static void main(String[] args) {
		
		Scanner calculateX = new Scanner(System.in);
		 
		int numberofIntegers = calculateX.nextInt();
		
		BigInteger sum = BigInteger.valueOf(0);
	    
		for(int i = 1; i<numberofIntegers+1;i++) {
		
			int x = calculateX.nextInt();
			BigInteger valueX = BigInteger.valueOf(x/10); 
			valueX = valueX.pow(x%10);
			
			//valueX = (int)Math.pow(x/10, x%10);
			
			sum = sum.add(valueX);
			
			//sum = valueX +sum;
		}
		
		calculateX.close();
	    
		System.out.println(sum);				
		
	}

}
