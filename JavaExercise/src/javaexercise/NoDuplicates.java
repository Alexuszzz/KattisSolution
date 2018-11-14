package javaexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class NoDuplicates {

	public static void main(String[] args) throws FileNotFoundException {

		//Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);

		List<String> words = new ArrayList<>();

		Set<String> sentences = new HashSet<>();

		while(sc.hasNext()) {  	

			words.add(sc.next()); 
		}

		for(String s: words) {
			sentences.add(s);
		}

		if(words.size() == sentences.size()) {
			
			System.out.println("yes");
			
		}else {
			
			System.out.println("no");
		}
	}

}
	

