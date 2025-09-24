package Desafios.Nivel_1.ContadorDeVogais;

import java.util.Scanner;
public class Main {
    // Proposta: O usuário insere uma palavra ou frase e o programa deverá retornar quantas vogais há.
    
    public static int contarVogais(String msg) {
        msg = msg.toLowerCase();
        int contador = 0;
        char[] vogais = {'a', 'á', 'à', 'ã', 'e', 'é','i', 'í', 'o', 'ó', 'u', 'ú'};

        for(int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            for(char v : vogais) {
                if (c == v) {
                    contador++;
                    break;
                }
            }
        }
        return contador;
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Contador de Vogais =====");
        System.out.print("Digite uma palavra ou frase: ");
        String msg = input.nextLine();

        System.out.printf("\nA frase '%s' contém %d vogais.", msg, contarVogais(msg));

        input.close();
    }
}