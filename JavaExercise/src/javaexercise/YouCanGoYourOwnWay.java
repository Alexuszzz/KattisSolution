package javaexercise;

import java.util.Scanner;

public class YouCanGoYourOwnWay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt(); 	
			
		
		for(int i=1;i<testcases+1;i++) {
			String dimension=sc.next();
			String computerway=sc.next();
			String yourway="";
		
			for(char ch: computerway.toCharArray()) {
			    
				if(ch == 'E') {
					yourway=yourway+'S';
				}else {
					yourway =yourway+'E';
				}
				}
				
			System.out.println("Case #"+i+": "+yourway);
			}								
		    
		}
		}
	

		
		
		
	
			
			
			
		
        	 
       
		
		




