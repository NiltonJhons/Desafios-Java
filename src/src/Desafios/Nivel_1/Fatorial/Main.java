package Desafios.Nivel_1.Fatorial;

import java.util.Scanner;

public class Main {
    // Proposta: O usuário insere um número e o programa retornará o fatorial deste número.
    
    public static int fatorial(int n) {
        System.out.print("\u001B[34m" + n + "! = ");
        int fatorial = 1;
        while (n > 1) {
            System.out.print(n + " \u001B[33m× \u001B[34m");
            fatorial *= n;
            n--;
        }
        System.out.print("1 = \u001B[32m");
        return fatorial;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[1m\u001B[35m===== Calculadora de Fatorial =====\u001B[0m");
        System.out.print("Digite um valor: ");
        int numero = input.nextInt();

        System.out.printf("\u001B[1m\u001B[31m%d\u001B[0m", fatorial(numero));

        input.close();
    }
}