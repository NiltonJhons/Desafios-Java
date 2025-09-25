package Desafios.Nivel_2.p005_Tabuada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa que calcule e imprima a tabuada na console (interativo).

    public static void tabuada(int n, int limite) {
        for (int i = 1; i < limite + 1; i++) {
            System.out.printf("%d × %d = %d\n", n, i, n * i);
        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Gerador de Tabuada =====");

        try {
            System.out.print("Insira um valor: ");
            int num = input.nextInt();

            System.out.print("Até qual número deseja calcular a tabuada? ");
            int limite = input.nextInt();

            System.out.println("\nResultado:");
            tabuada(num, limite);
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Digite apenas números inteiros!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!.");
        } finally {
            input.close();
        }
    }
}