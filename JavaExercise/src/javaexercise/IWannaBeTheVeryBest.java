package javaexercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheVeryBest {
	
	public static int getIndexOfBestP(List<Integer> list) {

		int best = 0;	
		int bestIndex = 0; 
		
		for(int i = 0; i<list.size(); i++) {
		
			 if(list.get(i)>best) {
				 
				 best = list.get(i);
				 bestIndex =  i;
			 }			 
		} 
		return  bestIndex;
	}
	
	
	public static Set<Integer> getIndexesOfKBest(int k, List<Integer> list) {
		
		List<Integer> listCopy = new ArrayList<>(list);
		
		Set<Integer> bestPokenom = new HashSet<>();
		
		for(int i = 0; i<k; i++) {
			
			int bestIndex = getIndexOfBestP(listCopy);
			
			bestPokenom.add(bestIndex);
			
			listCopy.set(bestIndex, -1);
			
		}
		
		return bestPokenom;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pokenom = sc.nextInt();
		int k = sc.nextInt();

	
		List<Integer> attack = new ArrayList<>();
		List<Integer> defence = new ArrayList<>();				
		List<Integer> health = new ArrayList<>();
		

		for(int y = 0; y<pokenom; y++) {				
			attack.add(sc.nextInt());
			defence.add(sc.nextInt());
			health.add(sc.nextInt());	
		}	
		
	     Set<Integer> bestPokenom = new HashSet<>();
	               bestPokenom.addAll(getIndexesOfKBest(k,attack));
	               bestPokenom.addAll(getIndexesOfKBest(k,defence));
	               bestPokenom.addAll(getIndexesOfKBest(k,health));
	     
	      System.out.println(bestPokenom.size());	
	      
	      sc.close();
		
	}


}







