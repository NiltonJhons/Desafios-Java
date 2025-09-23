package Desafios.Nivel_1.Arrays.PercorrerStrings;

import java.util.Scanner;

public class Main {
    // Proposta: Declarar um array de tamanho fixo (5 elementos) de Strings com 5 nomes e imprimir cada nome em uma linha.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Percorre Array com Strings =====\u001B[m");

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o %dº nome: ", i + 1);
            nomes[i] = input.nextLine();
        }

        System.out.println("\n\u001B[35m===== Percorrendo Array =====\u001B[0m");

        for (String n : nomes) {
            System.out.println(n);
        }

        input.close();
    }
}
