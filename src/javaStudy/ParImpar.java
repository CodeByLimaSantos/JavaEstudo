package javaStudy;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
         System.out.println("digite qual numero você quer saber se é par ou impar:");
		  int n1 = Entrada.nextInt();
		  
		  if (n1 % 2 == 0) 
		   { System.out.println("o número é PAR!");
			  
			
		    } else  { 
		     System.out.println("o número é IMPAR!");

		            }
		 
		 
		 Entrada.close();
		
	}

}
