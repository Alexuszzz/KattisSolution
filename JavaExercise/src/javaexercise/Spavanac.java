package javaexercise;

import java.util.Scanner;

public class Spavanac {

	public Spavanac() {
		
	}

	public static void main(String[] args) {
		Scanner clock  = new Scanner(System.in);
        int h = clock.nextInt();
        int m = clock.nextInt();
        clock.close();
        
       
        int newMinute = m - 45;
        int newHour = h;
        
        if (newMinute < 0 ) {    	
        	newMinute = 60 + newMinute;
        	newHour = h-1;
        }
        
        if(h==0 && m < 45) {
        	
        	newHour = 23;
        }
        
        //LocalDateTime startTime = LocalDateTime.of(2018, 02, 03,h, m);
        //LocalDateTime newTime = startTime.minusMinutes(45);
        //System.out.println(newTime.getHour() + " " + newTime.getMinute());
        
        System.out.println(newHour + " " + newMinute );
                   
	}
}