package javaexercise;

import java.util.Arrays;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		
      printListAsUpperCase(Arrays.asList(new String[] {"abba", "europe","sweden"}));
	}	
		
	public static void printListAsUpperCase(List<String> list) {
		 for(String elem: list) {
			 System.out.println(elem.toUpperCase());
		 }
	}

	}

