package Desafios.Nivel_1.p008_VerificarNumeroArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Receba um número inteiro, verifique sua ocorrência dentro de um array pré-definido (podendo conter valores repetidos)
    // e retorne se o número não está presente, se aparece uma única vez ou quantas vezes aparece no total.

    public static String percorreEVerifica(int n) {
        int[] numeros = {1, 3, 3, 5, 7, 7, 9};

        int contador = 0;

        for (int numero : numeros) {
            if (n == numero) {
                contador++;
            }
        }

        return switch (contador) {
            case 0 -> String.format("O valor %d NÃO está presente no array.", n);
            case 1 -> String.format("O valor %d aparece uma única vez no array.", n);
            default -> String.format("O valor %d aparece %d vezes no array.", n, contador);
        };
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Comparador de Valores em Array =====");
        try {
            System.out.print("Digite um valor inteiro: ");
            int numero = input.nextInt();

            System.out.println(percorreEVerifica(numero));
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Insira apenas númericos inteiros.");
        } catch (Exception e) {
            System.out.println("ERROR - Ocorreu um erro inesperado.");
        } finally {
            input.close();
        }
    }
}
