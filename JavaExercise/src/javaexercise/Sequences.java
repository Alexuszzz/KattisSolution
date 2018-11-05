package javaexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sequences {

	static List<ArrayList<Character>> inputList = new ArrayList<ArrayList<Character>>(); 

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("C:\\Users\\admin\\Desktop\\input.txt"));

		String firstInput =  sc.next();

		for(int i = 0; i<firstInput.length(); i++) {
			ArrayList<Character> listOfCharacters = new ArrayList<Character>();
			inputList.add(listOfCharacters);	    
		}

		addCharacterToAListOfArraylist(firstInput);

		while(sc.hasNextLine()) {	

			String input = sc.nextLine();

			addCharacterToAListOfArraylist(input);	
		}

		for(int i = 0; i<firstInput.length(); i++) {

			System.out.print(findTheMostFrequentLetter(inputList.get(i)));		
		}  

	}


	public static void addCharacterToAListOfArraylist(String input) {

		for(int i =0; i<input.length();i++) {

			inputList.get(i).add(input.charAt(i));
		}	   	    		
	}  

	public static int countFrequencyOfEachCharacter(List<Character> list, char ch) {

		int frequency = 0 ; 

		for(Character character : list) {

			if(ch == character) {
				frequency++;
			}	        
		}  	        
		return frequency;
	}


	public static char findTheMostFrequentLetter(List<Character> list) { 

		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

		int maxFrequency = 0;

		char theMostFrequencyCharacter = 'a';

		for (Character character: alphabet) {
			int newFrequency = countFrequencyOfEachCharacter(list,character);

			if(maxFrequency < newFrequency)	{

				maxFrequency = newFrequency;
				theMostFrequencyCharacter = character;
			}
		}
		return theMostFrequencyCharacter;
	}

}

           