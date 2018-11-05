package javaexercise;

import java.util.ArrayList;

public class ALchallenge {
	
		private final static int no_arguments = 1; 

	public static void main(String[] args) {
		 if(args.length == 0) {
           System.out.println("You must provide at least one argument");
           System.exit(no_arguments);
		 }
		
         ArrayList<String> argList = new ArrayList<>();
         
         for(String arg: args) {
        	 argList.add(arg);
         }
	}

}
