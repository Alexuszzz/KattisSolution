package javaexercise;

import java.util.Scanner;

public class ChessPieces {
   
	private int noOfKing;
	private int noOfQueen;
	private int noOfRooks;
	private int noOfBishops;
	private int noOfKnights;
	private int noOfPawns;
	
	
	public ChessPieces() {
		
	}
	
	public ChessPieces(int noOfKing, int noOfQueen,int noOfRooks,int noOfBishops, int noOfKnights,int noOfPawns  ) {
		
			this.noOfKing = noOfKing;
			this.noOfQueen = noOfQueen;
			this.noOfRooks = noOfRooks;
			this.noOfBishops = noOfBishops;
			this.noOfKnights = noOfKnights;
			this.noOfPawns = noOfPawns;
		
	}


	public int getNoOfKing() {
		return noOfKing;
	}


	public void setNoOfKing(int noOfKing) {
		this.noOfKing = noOfKing;
	}


	public int getNoOfQueen() {
		return noOfQueen;
	}


	public void setNoOfQueen(int noOfQueen) {
		this.noOfQueen = noOfQueen;
	}


	public int getNoOfRooks() {
		return noOfRooks;
	}


	public void setNoOfRooks(int noOfRooks) {
		this.noOfRooks = noOfRooks;
	}


	public int getNoOfBishops() {
		return noOfBishops;
	}


	public void setNoOfBishops(int noOfBishops) {
		this.noOfBishops = noOfBishops;
	}


	public int getNoOfKnights() {
		return noOfKnights;
	}


	public void setNoOfKnights(int noOfKnights) {
		this.noOfKnights = noOfKnights;
	}


	public int getNoOfPawns() {
		return noOfPawns;
	}


	public void setNoOfPawns(int noOfPawns) {
		this.noOfPawns = noOfPawns;
	}
	
	@Override
	
	public String toString() {
		return noOfKing+" "
	           +noOfQueen+" "
	           +noOfRooks+" "
	           +noOfBishops+" "
	           +noOfKnights+" "
	           +noOfPawns+" ";	           		
	}
	
	
    public ChessPieces calculateMissingPieces() {	
		final int correctNumberOfKing = 1;
		final int correctNumberOfQueen = 1;
		final int correctNumberOfRooks = 2;
		final int correctNumberOfBishops = 2;
		final int correctNumberOfKnights = 2;
		final int correctNumberOfPawns = 8;
		
		ChessPieces cp = new ChessPieces();
		
		cp.setNoOfKing(correctNumberOfKing - getNoOfKing());
		cp.setNoOfQueen(correctNumberOfQueen - getNoOfQueen());
		cp.setNoOfRooks(correctNumberOfRooks - getNoOfRooks());
		cp.setNoOfBishops(correctNumberOfBishops - getNoOfBishops());
		cp.setNoOfKnights(correctNumberOfKnights - getNoOfKnights());
		cp.setNoOfPawns(correctNumberOfPawns - getNoOfPawns());
	
		return cp;
		
    }
}
	
	
	
	
	

