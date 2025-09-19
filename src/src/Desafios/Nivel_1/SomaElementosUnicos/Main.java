package Desafios.Nivel_1.SomaElementosUnicos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    // Proposta: Utilizando Set/HashSet leia uma lista de números e calcule a soma entre eles considerando apenas os
    // valores não repetidos.

    static void main() {
        Set<Integer> numeros = new HashSet<>(List.of(2, 5, 7, 3, 2, 9, 5, 3));
        int total = 0;

        System.out.print("\u001B[33mSem repeti-los, os números contidos na lista são:\u001B[0m ");
        for (Integer n : numeros) {
            System.out.print(n + " ");
            total += n;
        }

        System.out.println("\n\u001B[33mE a soma entre todos eles é:\u001B[0m " + total);
    }
}
