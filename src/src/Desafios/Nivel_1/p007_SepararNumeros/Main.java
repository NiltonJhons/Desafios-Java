package Desafios.Nivel_1.p007_SepararNumeros;

import java.util.HashSet;
import java.util.Set;

public class Main {
    // Proposta: Percorra um array de números inteiros, separe os valores positivos e negativos em conjuntos distintos
    // e ao final exiba cada conjunto no console.

    static void main() {
        int[] numeros = {-4, -9, 34, 2, -1, 4, 97, -54, -43, 81};
        Set<Integer> numerosPositivos = new HashSet<>();
        Set<Integer> numerosNegativos = new HashSet<>();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                numerosPositivos.add(numeros[i]);
            } else {
                numerosNegativos.add(numeros[i]);
            }
        }

        System.out.println(numerosPositivos);
        System.out.println(numerosNegativos);
    }
}
