package javaexercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class IveBennEveryWhereMan {

	public static void main(String[] args) {

		Scanner sc  =  new Scanner(System.in);

		int testcase = sc.nextInt();

		for(int i = 0; i<testcase;i++) {
			
			int noOfCities = sc.nextInt();
		    
			//ArrayList<String> listofCity = new ArrayList<>();
			
			Set<String> cities = new HashSet<>();
			
			for(int y = 0; y<noOfCities; y++) {
				
				String city = sc.next();
				
					/*if(!(listofCity.contains(city))) {
						listofCity.add(city);							
					}*/    
				cities.add(city);
				
			}
			
			System.out.println(cities.size());
			
			
		}
	}

}
