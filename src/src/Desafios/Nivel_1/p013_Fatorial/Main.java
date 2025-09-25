package Desafios.Nivel_1.p013_Fatorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um calculador de fatorial (interativo).

    public static int fatorial(int n) {
        System.out.print(n + "! = ");
        int fatorial = 1;
        while (n > 1) {
            System.out.print(n + " × ");
            fatorial *= n;
            n--;
        }
        System.out.print("1 = ");
        return fatorial;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Calculadora de Fatorial =====");

        try {
            System.out.print("Digite um valor: ");
            int numero = input.nextInt();

            System.out.println(fatorial(numero));
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Digite apenas números inteiros!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!.");
        } finally {
            input.close();
        }

    }
}