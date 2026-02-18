package javaEstudo;

import java.util.Scanner;

public class ArrayIdadesNomesAlturaas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Quantas pessoas serão cadastradas?");
		num = entrada.nextInt();
		entrada.nextLine();
		
		
		String[] nomes = new String[num];
		Double[] alturas = new Double[num];
		int[] idades = new int[num];
		
		
		
		for (int i = 0; i < num ; i++) {
			System.out.println("dados da " + (i+1) + "pessoa : ");
			
			System.out.print("Nome:");
			nomes[i] = entrada.nextLine();
			
			  System.out.println("Idade:");
			  idades[i] = entrada.nextInt();
			
			    System.out.println("altura:");
			    alturas[i] = entrada.nextDouble();
			    entrada.nextLine();
			
			    
		}
		
		int somaid = 0;
		double somaalt = 0;
		double medialt = 0;
	
	//estrutura de arrays 
		
		for (int i = 0; i < num ; i++) {
				somaid = somaid + idades[i];
				somaalt = somaalt + alturas[i];	
		}
		
		medialt = somaalt / num;
		
		double cont = 0;
		
		for (int i = 0; i < num ; i++) {
			if (idades[i] < 18) { 
				cont++ ;	
			}
		}
		double Percent = (cont * 100) / num;
		
        System.out.println("a média das alturas dessas pessoas é igual a : " + medialt );
        System.out.println("a porcentagem das pessoas abaixo dos 18 anos é igual a : " + Percent + "%");
	
        
        entrada.close();
	}

}
