package javaexercise;

import java.util.Scanner;

public class QuickBrownFox {

	static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();
		sc.nextLine();

		//for (int i = 0; i < testcase; i++) {
		while (sc.hasNextLine()) {
			String input = sc.nextLine().toLowerCase();
			System.out.println(checker(input));
		}
		sc.close();
	}

	static private String checker(String line) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String letter : alphabet) {
			if (!line.contains(letter)) {
				stringBuilder.append(letter);
			}
		}

		if (stringBuilder.length() == 0) {
			return "pangram";
		} else {
			return "missing " + stringBuilder.toString();
		}
	}

}
