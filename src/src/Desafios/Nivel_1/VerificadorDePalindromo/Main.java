package Desafios.Nivel_1.VerificadorDePalindromo;

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

        System.out.println("\u001B[1m\u001B[35m===== Verificador de Palíndromos =====\u001B[0m");
        System.out.print("Digite uma palavra ou frase: ");
        String mensagem = input.nextLine();

        System.out.printf(isPalindromo(mensagem) ? "\u001B[32mA frase é um palíndromo.\u001B[0m" : "\u001B[31mA frase NÃO é um palindromo.\u001B[0m");

        input.close();
    }
}