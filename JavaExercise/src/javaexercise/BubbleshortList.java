package javaexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleshortList {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		List<Integer>inputs = new ArrayList<>();
		
		for(int i = 0; i<5;i++) {
			 inputs.add(sc.nextInt());
		}
         bubbleSort(inputs);
	}
	
	public static void bubbleSort(List<Integer> ints) {
		int n = ints.size();
		int temp = 0;
		for(int i = 0; i<ints.size(); i++) {
			for(int j = 1; j<n-i;j++) {
				if(ints.get(j-1) > ints.get(j)) {
					
					//swap elements
					temp = ints.get(j-1);
					ints.set(j-1, ints.get(j));
					ints.set(j, temp);
					
					//output immediately
					for(int k = 0; k < ints.size();k++) {
						System.out.print(ints.get(k) + " ");						
					}					
					System.out.println();
				}
			}
		}
	}

}
