package Desafios.Nivel_1.p010_SomaElementosUnicosSimples;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    // Proposta: Utilizando Set/HashSet, crie e leia uma lista de números e calcule a soma entre eles considerando apenas
    // os valores não repetidos.

    static void main() {
        Set<Integer> numeros = new HashSet<>(List.of(2, 5, 5, 7, 3, 3, 9, 1, 0, 0));
        int total = 0;

        System.out.print("Em ordem crescente e sem repetição, os números contidos na lista são: ");
        for (Integer n : numeros) {
            System.out.print(n + " ");
            total += n;
        }

        System.out.println("\nE a soma entre todos eles é: " + total);
    }
}
