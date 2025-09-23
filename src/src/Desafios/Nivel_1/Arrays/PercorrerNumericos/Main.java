package Desafios.Nivel_1.Arrays.PercorrerNumericos;

import java.util.Scanner;

public class Main {
    // Proposta: Declarar um array de tamanho fixo (5 elementos), preencher com inteiros de forma interativa com o
    // usuário e exibir cada um utilizando ForEach

    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Percorre Array =====\u001B[m");

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            numeros[i] = input.nextInt();
        }

        System.out.println("\u001B[33mPercorrendo Array com ForEach:\u001B[0m");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        input.close();
    }
}
