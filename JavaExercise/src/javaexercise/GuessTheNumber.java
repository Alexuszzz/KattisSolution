package javaexercise;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    int min = 1;
	    int max = 1000;
	    int guess = (max+min)/2;
	    System.out.println(guess);
	    
	   while(min <= max) {	   
		   
		   String reply = sc.next(); 
		   
		   if(reply.equals("correct")) {
			    break;  
			    
		   }else if(reply.equals("lower")) {
			   max=guess;
			   guess = (min + max)/2;
			  
		   }else if(reply.equals("higher")) {
			   min= guess;
			   guess =(min+max+1)/2;
			   
		   }
		   System.out.println(guess);  
		   
	   }
	   sc.close();
	}

}
