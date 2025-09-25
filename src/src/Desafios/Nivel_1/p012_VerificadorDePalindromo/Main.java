package Desafios.Nivel_1.p012_VerificadorDePalindromo;

import java.util.Scanner;

public class Main {
    // Proposta: O usuário insere uma palavra ou frase e o sistema deverá retornar se é ou não um palindromo.

    public static boolean isPalindromo(String msg) {
        msg = msg.toUpperCase().replace(" ", "");

        String msg_invertida = new StringBuilder(msg).reverse().toString();

        if (msg.equals(msg_invertida)) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Verificador de Palíndromos =====");
        System.out.print("Digite uma palavra ou frase: ");
        String mensagem = input.nextLine();

        System.out.printf(isPalindromo(mensagem) ? "A frase é um palíndromo." : "A frase NÃO é um palindromo.");

        input.close();
    }
}