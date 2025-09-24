package Desafios.Nivel_1.Arrays.CalculandoMedia;

import java.util.Scanner;

public class Main {
    // Proposta: Crie um programa interativo onde possa ser inserido o limite do array, depois armazene os elementos
    // digitados em um array, calcule a soma e a média aritmética simples de todos os elementos e, ao final, exiba os
    // resultados formatados de maneira clara no console.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Calculando a Média com Array =====");

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
                \nA soma entre todos os valores é %.1f
                E a média é %.1f
                """, soma, media);

        input.close();
    }
}
