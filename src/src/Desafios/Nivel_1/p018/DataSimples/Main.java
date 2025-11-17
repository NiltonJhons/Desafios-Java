package Desafios.Nivel_1.p018.DataSimples;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        boolean valido;

        do {
            System.out.println("Escolha um dia [1 a 31]: ");
            dia = input.nextInt();

            System.out.println("Escolha um mês [1 a 12]: ");
            mes = input.nextInt();

            System.out.println("Escolha um ano: ");
            ano = input.nextInt();

            boolean diaValido = dia >= 1 && dia <= 31;
            boolean mesValido = mes >= 1 && mes <= 12;
            boolean anoValido = ano <= 2025;

            valido = (diaValido && mesValido && anoValido);

            if (!diaValido) System.out.println("O dia inserido está inválido.");
            if (!mesValido) System.out.println("O mês inserido está inválido.");
            if (!anoValido) System.out.println("O ano inserido está inválido.");
        } while (!valido);

        input.close();

        Data data = new Data(dia, mes, ano);
        System.out.println(data.formatacao());
    }
}
