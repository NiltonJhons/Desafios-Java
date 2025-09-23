package Desafios.Nivel_1.VerificadorParOuImpar;

import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa onde será inserido um inteiro e terá como retorno se ele é par ou impar (interativo)

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\u001B[35m===== Detector de Par ou Impar =====\u001B[0m");

        while (true) {
            try {
                System.out.print("Insira um valor: ");
                int num = input.nextInt();
                System.out.printf("O número \u001B[34m%d\u001B[0m é \u001B[1m\u001B[31m%s\u001B[0m.", num, (num % 2 == 0 ? "Par" : "Impar"));
                break;
            } catch (Exception e) {
                System.out.println("\u001B[1m\u001B[31mDigite apenas números inteiros!\u001B[0m\n");
                input.nextLine();
            }
        }
        System.out.println("\n\u001B[35mAté mais!\u001B[m");
        input.close();
    }
}