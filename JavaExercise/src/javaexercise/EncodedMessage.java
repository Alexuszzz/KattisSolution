package javaexercise;

import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int testcases = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<testcases; i++) {
			String line = sc.next();
			int rowlen = (int)Math.sqrt(line.length());
			for (int j = rowlen-1; j >=0; j--) {
		        for (int k = j; k < line.length(); k+=rowlen) {
		          sb.append(line.charAt(k));
		        }
		      }
			sb.append(System.lineSeparator());
		}		
		   System.out.print(sb);	
		   sc.close();
}
	}
