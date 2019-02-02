package javaexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Dyslectionary {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(new File("C:\\Users\\admin\\Desktop\\samples\\sample.txt"));
		Scanner sc = new Scanner(System.in);
		
		boolean finished = false;
		 	 
		while(sc.hasNext()) {

			List<String> dictionary  = new ArrayList<>();
			int max = 0;

			while(sc.hasNext()) {

				String word = sc.nextLine();
				
				if(word == null) {
					finished = true; 
					break; 
				}

				if(word.isEmpty()) {
					break;
				}		
				
				dictionary.add(word);

				if(word.length()>max) {
					max = word.length();

				}
				
			} 	

			//set up the presentation

			for(int i=0; i< dictionary.size(); i++) {

				String word1 = dictionary.get(i);
				int spaces = max - word1.length();

				for(int y = 0; y<spaces; y++) {

					word1 = " " + word1;
				}

				dictionary.set(i, word1);
			}

			//1 bigger, 0 equal, -1 less than

			Collections.sort(dictionary, new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {

					for(int i = s1.length()-1; i>=0; i--) {
						if(s1.charAt(i) != s2.charAt(i))
							return s1.charAt(i)-s2.charAt(i);									 				
					}

					return 0;
				}
			});

			for(String w: dictionary) {
				System.out.println(w);
			}

			if(!finished) {
				System.out.println(" "); 
			}
         
		}     
         sc.close();
	}
}
		
	
			
			    		
		 
		



	

