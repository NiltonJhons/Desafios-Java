package Desafios.Nivel_2.Potencia;

import java.util.Scanner;

public class Main {
    // Proposta: Crie um programa capaz de calcular a potência de um número (interativo)

    public static int CalculadorPotencia(int base, int e) {
        int resultado = 1;
        for (int i = 0; i < e; i++) {
            if (i != (e - 1)) {
                System.out.print(base + " x ");
            } else {
                System.out.print(base + " = ");
            }
            resultado *= base;
        }
        return resultado;
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[1m\u001B[35m===== Calculador de Potência =====\u001B[0m");
        System.out.print("Valor da base: ");
        int base = input.nextInt();
        System.out.print("Valor do expoente: ");
        int expoente = input.nextInt();

        System.out.println("\nResultado:");
        System.out.println(CalculadorPotencia(base, expoente));

        input.close();
    }
}
