package Desafios.Nivel_1.Arrays.CalculandoMedia;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Proposta: Crie um programa interativo onde possa ser inserido o limite do array, depois armazene os elementos
    // digitados em um array, calcule a soma e a média aritmética simples de todos os elementos e, ao final, exiba os
    // resultados formatados de maneira clara no console.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Calculando a Média com Array =====\u001B[0m");

        System.out.print("Quantos valores deseja inserir?: ");
        int qtd = input.nextInt();

        double[] numeros = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Insira o %dº valor: ", i + 1);
            double n = input.nextDouble();

            numeros[i] = n;
        }

        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += numeros[i];
        }

        double media = soma / qtd;

        System.out.printf("""
                \n\u001B[34mA soma entre todos os valores é \u001B[1m\u001B[31m%.1f\u001B[0m\u001B[34m
                E a média é \u001B[1m\u001B[31m%.1f\u001B[0m
                """, soma, media);

        input.close();
    }
}
