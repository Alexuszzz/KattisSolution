package javaexercise;
import java.util.Scanner;

public class ForegoneSolution {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char four = '4';
			
		int testcases = sc.nextInt();
				
		for(int i=1;i<testcases+1; i++) {
			String input = sc.next();
			String a ="";
			String b ="";
			
			for(char ch: input.toCharArray()) {
				if(ch == four) {
					a = a+'3';
					b = b+'1';					
				}else {
					a = a+ch;						
					if(b.contains("1")) {
						b=b+'0';
					}
				}			
			}
		
		System.out.println("Case #"+i+": "+a+" "+b);
		}
	}

}
