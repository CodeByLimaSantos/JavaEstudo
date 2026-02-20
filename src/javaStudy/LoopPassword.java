package javaEstudo;

import java.util.Scanner;

public class Loop {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
	    int Pass = terminal.nextInt();
	   
	    
	    while (Pass != 2422) {
	    	System.out.println("Senha incorreta!");
	    	Pass = terminal.nextInt();	
		}
	    
	    System.out.println("Acesso permitido!");
	    
	    terminal.close();
	}

}
