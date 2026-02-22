package javaEstudo;

import java.util.Scanner;

public class maxFunction {

	
	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
			int n1;
			int n2;
			int n3;
				System.out.println("Type the first number : ");
				n1 = entry.nextInt();
				System.out.println("Type the first number : ");
				n2 = entry.nextInt();
				System.out.println("Type the first number : ");
				n3 = entry.nextInt();
				
		int higher = max(n1,n2,n3);
				
		showResult(higher);
		entry.close();
				
	}
	
	public static int max(int x, int y, int z) { 
		int aux;
		
				if ( x > y && x > z) {
					
				aux = x;
					
				} else if ( y > z ) {
				aux = y;
					
				} else {
				aux = z;
				}
		return aux;
				
	}
	
	public static void showResult(int value) {
		
				System.out.println("higher = " + value);
	}
}
