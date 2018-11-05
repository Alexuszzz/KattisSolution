package javaexercise;

import java.util.Scanner;

public class DiceUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dFace1 = sc.nextInt();
		int dFace2 = sc.nextInt();

		if(dFace1 <= dFace2) {

			for(int i = dFace1+1; i<=dFace2+1; i++) {

				System.out.println(i);				
			}

		}else {

			for(int i = dFace2+1; i<=dFace1+1; i++) {

				System.out.println(i);
			}
		}
		sc.close();		
	}
}

	


