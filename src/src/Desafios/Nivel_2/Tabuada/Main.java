package Desafios.Nivel_2.Tabuada;

import java.util.Scanner;

public class Main {
    // Proposta: Crie um programa que calcule e imprima a tabuada na tela (interativo)

    public static void tabuada(int n, int limite) {
        for (int i = 1; i < limite + 1; i++) {
            System.out.printf("\u001B[34m%d × %d = \u001B[1m\u001B[31m%d\u001B[0m\n", n, i, n * i);
        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Gerador de Tabuada =====\u001B[0m");

        System.out.print("Insira um valor: ");
        int num = input.nextInt();

        System.out.print("Até qual número deseja calcular a tabuada? ");
        int limite = input.nextInt();

        System.out.println("\u001B[33m\nResultado:\u001B[m");
        tabuada(num, limite);

        input.close();
    }
}