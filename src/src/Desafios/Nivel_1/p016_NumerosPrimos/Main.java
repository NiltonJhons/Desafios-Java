package Desafios.Nivel_1.p016_NumerosPrimos;

import java.util.Scanner;

public class Main {
    // Proposta: O usuário fornece um limite. O programa deve listar todos os números primos até esse limite.

    static boolean isPrimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Gerador de Números Primos ===");
        System.out.print("Insira até qual número você deseja gerar: ");
        int limite = input.nextInt();

        System.out.printf("\nO números primos até %d são: \n", limite);
        for (int i = 2; i < limite; i++) {
            if (isPrimo(i)) {
                System.out.printf("| %d | ", i);
            }
        }

        input.close();
    }
}