package javaEstudo;

import java.util.Scanner;

public class PostoDeCombustível {

	public static void main(String[] args) {
		
		 Scanner terminal = new Scanner(System.in);
		 
		 System.out.println("Selecione um tipo de combustivel" 
	 			+  "\n1.Álcool"
		 		+ "\n2.Gasolina"
		 		+ "\n3.Diesel"
		 		+ "\n4.Fim");
		 
		int type = terminal.nextInt();
		
		 while ( type != 4 ) {
			 
			 if ( type == 1 ) {
				 System.out.println("Álcool.");				 
				
			 } else if ( type == 2 ) {
					System.out.println("Gasolina.");
					
			 } else if ( type == 3 ) {
				System.out.println("Diesel");
			 }
			
			 type = terminal.nextInt();
			 
		}
		 			terminal.close();
	}
}
