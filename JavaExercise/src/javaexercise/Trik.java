package javaexercise;

import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		char[] moves = sc.next().toCharArray();
		
		int ballposition = 1;
		
		for(int i = 0; i<moves.length;i++) {
			
			if(moves[i]=='A') {
				if(ballposition == 1)ballposition = 2;			
				else if (ballposition == 2)ballposition = 1;
				else  ballposition = 3;
			}
			
			if(moves[i]=='B') {
				if(ballposition == 1)ballposition = 1 ;
				else if(ballposition == 2)ballposition = 3;
				else ballposition = 2;
			}
			
			if(moves[i]=='C') {
				if(ballposition == 1)ballposition = 3;
				else if(ballposition ==2)ballposition =2; 
				else ballposition = 1;
			}
		}
		
		System.out.println(ballposition);
		sc.close();

	}

}
