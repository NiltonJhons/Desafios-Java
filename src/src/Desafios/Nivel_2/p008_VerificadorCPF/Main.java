package Desafios.Nivel_2.p008_VerificadorCPF;

import java.util.Scanner;

public class Main {
    // Proposta: Desenvolva um programa completo capaz de verificar se um cpf é válido.

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Verificador de CPF ===");
        System.out.print("Digite o seu CPF [XXX.XXX.XXX-XX]: ");
        String cpf = input.nextLine();

        // Remove os espaços vazios
        cpf = cpf.replace(" ", "");

        // Verifica se há 14 digitos e se NÂO há letras
        if (cpf.length() == 14 && !cpf.matches(".*[a-zA-Z].*")) {
            Verificador.verificadorPontuacao(cpf);
        } else {
            System.out.println("CPF Inválido.");
        }

        input.close();
    }
}
