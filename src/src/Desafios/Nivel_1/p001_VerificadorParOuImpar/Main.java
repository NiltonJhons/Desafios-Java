package Desafios.Nivel_1.p001_VerificadorParOuImpar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa que receba um número inteiro do usuário e determine se ele é par ou ímpar, tratando
    // entradas inválidas e exibindo o resultado.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Detector de Par ou Impar =====");

        try {
            System.out.print("Insira um valor: ");
            int num = input.nextInt();
            System.out.printf("O número %d é %s.", num, (num % 2 == 0 ? "Par" : "Impar"));
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros!");
            input.nextLine();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!.");
        } finally {
            input.close();
        }
    }
}