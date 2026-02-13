package javaStudy;

import java.util.Scanner;

public class maiorNumero {
	public static void main(String[] args) 
	{
	
		Scanner Entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro número:");
		int n1 = Entrada.nextInt();
		
		  System.out.println("digite o segundo número:");
		  int n2 = Entrada.nextInt();
		  
			System.out.println("digite o terceiro número:");
			int n3 = Entrada.nextInt();
			
			 int maior = n1;
			
			 if ( n2 > maior ) { n2 = maior;	
			
			 } if ( n3 > maior ) { n3 = maior;
			
			  } if ( n1 == n2 && n2 == n3 ) { System.out.println("Todos números são iguais!");
				
			   } else { System.out.println("");
			   
			   Entrada.close();
				
			}
					
	  }

}
