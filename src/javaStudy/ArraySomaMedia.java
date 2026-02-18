package javaEstudo;

import java.util.Scanner;

public class ArrayVetor2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int num; 
		
		System.out.println("Digite a quantidade de números que voce deseja armazenar:");
		num = entrada.nextInt(); 
		
		int[] vet = new int [num]; 
		
		for (int i = 0; i < num ; i++) {
			System.out.println("Digite um numero: ");
		vet[i] = entrada.nextInt();
			
		}
	
		
		for (int i = 0; i < num ; i++) {
			System.out.println("número armazenado:  " + vet[i]);
			
		}
		
		int mais = 0;
		
		for (int i = 0; i < num ; i++) {
			mais = mais + vet[i];
		}
		
		double Media = 0;
		
		for (int i = 0; i < num; i++) {
			Media = mais / num;
			
		}
		
		System.out.println("a soma desses numeros é igual a: " + mais);
		System.out.println("a média desses numeros é igual a: " + Media);	
							
	}

}
