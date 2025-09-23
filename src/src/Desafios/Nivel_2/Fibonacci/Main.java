package Desafios.Nivel_2.Fibonacci;

import java.util.Scanner;

public class Main {
    // Proposta: Gerar a sequência de Fibonacci com um número específico de termos de acordo com o usuário.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m   ===== Sequência de Fibonacci =====\u001B[0m");

        try {
            System.out.print("Digite o número de termos da sequência: ");
            int qtd = input.nextInt();

            System.out.printf("\u001B[1m\u001B[34mResultado da Sequência com %d Termos: \u001B[0m", qtd);
            int anterior = 0, posterior = 1;

            for (int i = 0; i < qtd; i++) {
                System.out.print(anterior + " ");
                int proximo = anterior + posterior;
                anterior = posterior;
                posterior = proximo;
            }
        } catch (Exception e) {
            System.out.print("\u001B[31mERROR - Digite apenas números inteiros!\u001B[0m");
        } finally {
            input.close();
        }
    }
}
