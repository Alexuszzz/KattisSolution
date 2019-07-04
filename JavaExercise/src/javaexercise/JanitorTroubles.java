package javaexercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JanitorTroubles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#0.###################");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
        
        double semiperimeter = (a+b+c+d)/2.0;	
            
        System.out.println(decimalFormat.format(Math.sqrt((semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c)*(semiperimeter-d))));
      
	}

}
