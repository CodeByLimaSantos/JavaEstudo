package javaEstudo;

import java.util.Scanner;

public class arrayVet {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num; //declarando
		System.out.println("quantos numeros voce quer digitar?");
		num = entrada.nextInt(); //lendo entrada
		
		double[] vet = new double [num]; // declarando vetor
		
		for (int i = 0; i < num ; i++) {
			System.out.println("digite um numero :  ");
			vet[i] = entrada.nextDouble();
		//saida solicita preenchimento de dados e armazena	
		}
		
		System.out.println();
		System.out.println("NUMEROS DIGITADOS : ");
		for (int i = 0; i < num ; i++) {
			System.out.println(vet[i]);
			//expoe dados
		}
		 entrada.close();
	}

}
