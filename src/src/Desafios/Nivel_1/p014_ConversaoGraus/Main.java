package Desafios.Nivel_1.p014_ConversaoGraus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit, permitindo que o usuário
    // escolha a escala de entrada, insira o valor e obtenha o resultado convertido na outra escala.

    public static String conversaoCparaF(double c) {
        return String.format("%.1fºC -> %.1fºF", c, (c * 9 / 5 + 32));
    }

    public static String conversaoFparaC(double f) {
        return String.format("%.1fºF -> %.1fºC", f, ((f - 32) * 5 / 9));
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("""
                ============================================
                |     Escolha o seu tipo de conversão      |
                --------------------------------------------
                |   1 - Celsius -> Fahrenheit              |
                |   2 - Fahrenheit -> Celsius              |
                ============================================
                | Escolha uma das opções acima [1/2]: """);
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor de Cº: ");
                    double celsius = input.nextDouble();
                    System.out.println(conversaoCparaF(celsius));
                    break;
                case 2:
                    System.out.print("Insira o valor de Fº: ");
                    double fahrenheit = input.nextDouble();
                    System.out.println(conversaoFparaC(fahrenheit));
                    break;
                default:
                    System.out.println("Esta opção é inválida!");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR - Digite apenas números inteiros!\n");
        } catch (Exception e) {
            System.out.println("ERROR - Ocorreu um erro inesperado!\n");
        } finally {
            input.close();
        }
    }
}