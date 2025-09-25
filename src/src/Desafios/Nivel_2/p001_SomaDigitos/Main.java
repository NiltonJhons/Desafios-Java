package Desafios.Nivel_2.p001_SomaDigitos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Calcule a soma de todos os dígitos de um número inteiro positivo inserido pelo usuário.

    public static int somaDosDigitos(int n) {
        if (n == 0) {
            return 0;
        }

        int soma = 0;

        while (n > 0) {
            int digito = n % 10;
            if (n > 10) {
                System.out.print(digito + " + ");
            } else {
                System.out.print(digito + " = ");
            }

            soma += digito;
            n = n / 10;
        }

        return soma;
    }
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Somatório de Dígitos =====");

        try {
            System.out.print("Digite um valor inteiro positivo: ");
            int numero = input.nextInt();

            System.out.println(somaDosDigitos(numero));
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Digite apenas números inteiros!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!.");
        } finally {
            input.close();
        }
    }
}