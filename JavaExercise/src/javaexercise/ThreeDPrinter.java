package javaexercise;

import java.util.Scanner;

public class ThreeDPrinter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numOfStatues = sc.nextInt();
        int printer = 1;
        int days = 0;
        int printedStatues = 0;
        
        while(printedStatues < numOfStatues) {
        	if((numOfStatues-printedStatues) > printer) {
        		days +=1;
        		printer += printer;
        	}else {
        		days +=1;
        		printedStatues += printer;       		
        	}
        }
       
       System.out.println(days);
       sc.close();
	}

}
