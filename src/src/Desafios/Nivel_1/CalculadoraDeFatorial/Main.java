package Desafios.Nivel_1.CalculadoraDeFatorial;

import java.util.Scanner;

public class Main {
    // Proposta: O usuário insere um número e o programa retornará o fatorial deste número.
    
    public static int fatorial(int n) {
        System.out.print(n + "! = ");
        int fatorial = 1;
        while (n > 1) {
            System.out.print(n + " × ");
            fatorial *= n;
            n--;
        }
        System.out.print("1 = \u001B[32m");
        return fatorial;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Calculadora de Fatorial =====\u001B[0m");
        System.out.print("Digite um valor: ");
        int numero = input.nextInt();

        System.out.println(STR."\{fatorial(numero)}\u001B[0m");
    }
}