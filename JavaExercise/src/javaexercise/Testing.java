package javaexercise;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Testing {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat(".00");
		 
		 df.setRoundingMode(RoundingMode.HALF_UP);
		  
		 System.out.println(df.format(5));

	}

}
