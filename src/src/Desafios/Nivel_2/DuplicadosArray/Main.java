package Desafios.Nivel_2.DuplicadosArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Proposta: Remover elementos duplicados de um array mantendo apenas a primeira ocorrência de cada elemento.

    static void main() {
        int[] numeros = {1, 1, 2, 3, 4, 5, 5};

        List<Integer> semDuplicados = new ArrayList<>();

        for (int n : numeros) {
            if (!semDuplicados.contains(n)) {
                semDuplicados.add(n);
            }
        }

        System.out.println(semDuplicados);
    }
}
