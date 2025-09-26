package Desafios.Nivel_1.p014_MedidasCirculo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa que a partir de uma medida fornecida pelo usuário (raio, diâmetro,
    // circunferência ou área), seja capaz de calcular e exibir todas as demais medidas correspondentes do círculo.

    public static String baseRaio(double r) {
        return String.format("""
                =============================================================
                |                         RESULTADO                         |
                =============================================================
                | Se o r é equivalente a %.2f, obtemos as seguinte medidas:
                -------------------------------------------------------------
                |               Diâmetro       |  %.2f
                |               Circuferência  |  %.2f
                |               Área           |  %.2f
                =============================================================
                """, r, (2 * r), (2 * Math.PI * r), (Math.PI * (r * r)));
    }

    public static String baseDiametro(double d) {
        return String.format("""
                ====================================================================
                |                             RESULTADO                            |
                ====================================================================
                | Se o Diametro é equivalente a %.2f, obtemos as seguinte medidas:
                --------------------------------------------------------------------
                |                  Raio           |  %.2f
                |                  Circuferência  |  %.2f
                |                  Área           |  %.2f
                ====================================================================
                """, d, (d / 2), (Math.PI * d), (Math.PI * (d * d) / 4));
    }

    public static String baseCircunferencia(double c) {
        return String.format("""
                =========================================================================
                |                             RESULTADO                                 |
                =========================================================================
                | Se a Circuferência é equivalente a %.2f, obtemos as seguinte medidas:
                -------------------------------------------------------------------------
                |                         Raio      |  %.2f
                |                         Diâmetro  |  %.2f
                |                         Área      |  %.2f
                =========================================================================
                """, c, (c / (2 * Math.PI)), (c / Math.PI), ((c * c) / (4 * Math.PI)));
    }

    public static String baseArea(double a) {

        return String.format("""
                =============================================================
                |                         RESULTADO                         |
                =============================================================
                | Se o r é equivalente a %.2f, obtemos as seguinte medidas:
                -------------------------------------------------------------
                |               Raio           |  %.2f
                |               Diâmetro       |  %.2f
                |               Circuferência  |  %.2f
                =============================================================
                """, a, Math.sqrt((a / Math.PI)), 2 * Math.sqrt(a / Math.PI), 2 * Math.PI * Math.sqrt(a / Math.PI));
    }


    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("      ===== Calculador de Medidas de um Circulo =====");
        System.out.print("""
                ============================================================
                | Qual medida você deseja inserir para calcular as demais? |
                ============================================================
                |   1 - Raio                                               |
                |   2 - Diâmetro                                           |
                |   3 - Circunferência                                     |
                |   4 - Área                                               |
                ============================================================
                """);


        int opcaoMedida = 0;
        double valorPrincipal = 0;

        while (true) {
            try {
                System.out.print("|   Insira o valor númerico inteiro: ");
                opcaoMedida = input.nextInt();
                input.nextLine();

                if (opcaoMedida < 1 || opcaoMedida > 4) {
                    System.out.println("Opção inválida! Digite um número entre 1 e 4.\n");
                    continue;
                }

                System.out.println("============================================================");

                switch (opcaoMedida) {
                    case 1:
                        System.out.print("|   Digite o valor do Raio: ");
                        valorPrincipal = input.nextDouble();
                        break;
                    case 2:
                        System.out.print("|   Digite o valor do Diâmetro: ");
                        valorPrincipal = input.nextDouble();
                        break;
                    case 3:
                        System.out.print("|   Digite o valor da Circunferência: ");
                        valorPrincipal = input.nextDouble();
                        break;
                    case 4:
                        System.out.print("|   Digite o valor da Área: ");
                        valorPrincipal = input.nextDouble();
                        break;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("\nERROR - Insira apenas números!\nReiniciando...\n");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR - Ocorreu um erro inesperado!\n");
                input.nextLine();
                break;
            }
        }

        switch (opcaoMedida) {
            case 1 -> System.out.println(baseRaio(valorPrincipal));
            case 2 -> System.out.println(baseDiametro(valorPrincipal));
            case 3 -> System.out.println(baseCircunferencia(valorPrincipal));
            case 4 -> System.out.println(baseArea(valorPrincipal));
        }

        input.close();
    }
}