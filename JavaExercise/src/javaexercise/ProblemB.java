package javaexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ProblemB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int numberOfFriends = sc.nextInt();
		int numberOfFriendship = sc.nextInt();


		int [] listOfDebts = new int [numberOfFriends];

		for(int i =0; i<numberOfFriends; i++) {

			int money = sc.nextInt();

			listOfDebts[i] = money;

		}

		List<Set<Integer>> independentGroups = new ArrayList<Set<Integer>>();

		for(int i = 0; i<numberOfFriendship; i++) {

			int person1 = sc.nextInt();
			int person2 = sc.nextInt();
			Set<Integer> person1group = null;
			Set<Integer> person2group = null;
			
			boolean foundPerson1 = false;
			boolean foundPerson2 = false;

			for (Set<Integer> group :independentGroups) {
				if(group.contains(person1)) {
					person1group = group;
					foundPerson1 = true;
				} else if (group.contains(person2)) {
					person2group = group;
					foundPerson2 = true;
				}
			}   

			if (foundPerson1 == true && foundPerson2 == false)
			{
				person1group.add(person2);
			} else if (foundPerson1 == false && foundPerson2 == true) {
				person2group.add(person1);
			} else if (foundPerson1 == true && foundPerson2 == true) {
				// Merge the groups
				person1group.addAll(person2group);
				independentGroups.remove(person2group);
			} else {
				Set<Integer> newSet = new HashSet<Integer>();
				newSet.add(person1);
				newSet.add(person2);

				independentGroups.add(newSet);				
			}
		}

//		System.out.println(independentGroups);
		
		// Find any person that has no friends
		for(int person = 0; person < numberOfFriends; person++) {
			boolean needToCreateNewSet = true;

			for (Set<Integer> group :independentGroups) {
				if(group.contains(person)) {
					needToCreateNewSet = false;
					break;
				}
			}   

			if(needToCreateNewSet == true) {
				Set<Integer> newSet = new HashSet<Integer>();
				newSet.add(person);
				independentGroups.add(newSet);
			}
		}

		int sum = 0;
		for (Set<Integer> group :independentGroups) {

			for(Integer person: group) {
				sum += listOfDebts[person];
			}

			if (sum !=0) {
				System.out.println("IMPOSSIBLE");
				break;
			}

		}
		if (sum == 0) { 
			System.out.println("POSSIBLE");
		}
	}
}

