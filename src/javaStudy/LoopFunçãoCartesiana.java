package javaEstudo;

import java.util.Scanner;

public class LoopFuncaoCartesiana {
	
	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		double x = Entrada.nextDouble();
		double y = Entrada.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0)  {
				System.out.println("O par ordenado pertence ao primeiro Quadrante.");
				
			}
			else if (x < 0 && y > 0) {
				System.out.println("O par ordenado pertence ao Segundo Quadrante.");
				
			}
			else if (x < 0 && y < 0) {
				System.out.println("O par ordenado pertence ao Terceiro Quadrante.");
				
			} else { 
			System.out.println("o par ordenado pertence ao Quarto Quadrante.");
			}
			
			x = Entrada.nextInt();
			y = Entrada.nextInt();
		}
		
		Entrada.close();
		
	}
	
}
