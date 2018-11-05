package javaexercise;

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		 
		//int [] correctSet = {1,1,2,2,2,8};
			      
		//for(int i =0; i<6;i++) {
			
			//System.out.print(correctSet[i]-sc.nextInt()+ " ");
	//	}*/
		
       ChessPieces cp = new ChessPieces();
       
       cp.setNoOfKing(sc.nextInt());
       cp.setNoOfQueen(sc.nextInt());
       cp.setNoOfRooks(sc.nextInt());
       cp.setNoOfBishops(sc.nextInt());
       cp.setNoOfKnights(sc.nextInt());
       cp.setNoOfPawns(sc.nextInt());
       
       System.out.print(cp.calculateMissingPieces());


	}
}