package Desafios.Nivel_2.Fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Gerar a sequência de Fibonacci com um número específico de termos de acordo com o usuário.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Sequência de Fibonacci =====");

        try {
            System.out.print("Digite o número de termos da sequência: ");
            int qtd = input.nextInt();

            System.out.printf("Resultado da Sequência com %d Termos: ", qtd);
            int anterior = 0, posterior = 1;

            for (int i = 0; i < qtd; i++) {
                System.out.print(anterior + " ");
                int proximo = anterior + posterior;
                anterior = posterior;
                posterior = proximo;
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Digite apenas números inteiros!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado!.");
        } finally {
            input.close();
        }
    }
}
