package Desafios.Nivel_2.p004_MaiorEMenorLista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Proposta: Permita que o usuário insira uma lista de números inteiros de tamanho indefinido e exiba o maior e o menor valor ao final.

    public static String verificadorDeExtremos(List<Integer> nums) {

        int menorValor = 0, maiorValor = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (i == 0) {
                menorValor = nums.get(i);
                maiorValor = nums.get(i);

            } else {
                if (nums.get(i) < menorValor) menorValor = nums.get(i);
                if (nums.get(i) > maiorValor) maiorValor = nums.get(i);
            }
        }

        /* Outra maneira mais simples:
        int menorValor = Integer.MIN_VALUE;
        int maiorValor = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < menorValor) menorValor = n;
            if (n > maiorValor) maiorValor = n;
        }

        Porém, o intuito foi mostrar a lógica passo a passo, exercitar o raciocínio
        e o controle manual de variáveis, enquanto essa abordagem é apenas um facilitador.
        */

        return String.format("""
                =========================
                Maior Valor da Lista: %d 
                Menor Valor da Lista: %d
                =========================
                """, maiorValor, menorValor);
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.println("===== Calculador de Extremos da Lista =====");
        System.out.println("Insira '-999' para encerrar a repetição.\n");
        while (true) {
            try {
                System.out.print("Insira um número inteiro: ");
                int num = input.nextInt();
                input.nextLine();

                if (num == -999) break;

                numeros.add(num);

                System.out.println("   --- Continuando ---");
            } catch (InputMismatchException e) {
                System.out.println("ERROR - Digite apenas números inteiros!\n");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR - Ocorreu um erro inesperado.\n");
                input.nextLine();
            }
        }

        switch (numeros.size()) {
            case 0 -> System.out.println("Não foram inseridos valores! A lista está vazia.");
            case 1 -> System.out.println("Foi inserido apenas um único valor! Lista: " + numeros);
            default -> System.out.println(verificadorDeExtremos(numeros));
        }
    }
}