package javaEstudo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        entrada.nextLine(); // limpar buffer do teclado

        System.out.print("Escolha entre: +, -, *, /: ");
        String operacao = entrada.nextLine();

        double resultado; // declarar antes do switch

        // Calcular resultado
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    entrada.close();
                    return; 
                }
                break;
            default:
                System.out.println("A operação não foi identificada!");
                entrada.close();
                return; 
        }

        if (resultado % 1 == 0) {
            System.out.println("O resultado é igual a: " + String.format("%.0f", resultado));
        } else {
            System.out.println("O resultado é igual a: " + String.format("%.1f", resultado));
        }

        entrada.close();
    }
}
