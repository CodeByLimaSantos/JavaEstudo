package javaEstudo;

import java.util.Scanner;

public class AumentoSalarial {
	//sistema o qual converte string em tipo primitivo Double
	//aumento salarial de 10%
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu salário atual?");
		String SalarioString = entrada.nextLine();	
		
		Double SalarioActual = Double.parseDouble(SalarioString);
		
		Double Porcentagem = (SalarioActual * 10 / 100);
		Double Aumento = SalarioActual + Porcentagem ;
		
		System.out.println("Seu aumento salarial de 10% foi aplicado!");
		System.out.print("\nA partir de agora você receberá :" + Aumento);
		
		entrada.close();		
		
	}

}
