package Desafios.Nivel_1.p015_VerificadorString;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira uma palavra ou frase: ");
        String texto = input.nextLine();

        System.out.printf("O texto contém...\nLetras? %s", texto.matches(".*[a-zA-Z].*") ? "Sim" : "Não");
        System.out.printf("\nNúmeros? %s", texto.matches(".*[0-9].*") ? "Sim" : "Não");
        System.out.printf("\nAlguma letra minúscula? %s", texto.matches(".*[a-z].*") ? "Sim" : "Não");
        System.out.printf("\nAlguma letra maiúscula? %s", texto.matches(".*[A-Z].*") ? "Sim" : "Não");
        System.out.printf("\nSimbolos ou Espaços? %s", texto.matches(".*[^a-zA-Z0-9].*") ? "Sim" : "Não");

        input.close();
    }
}
