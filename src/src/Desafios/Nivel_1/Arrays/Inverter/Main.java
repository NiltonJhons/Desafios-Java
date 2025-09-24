package Desafios.Nivel_1.Arrays.Inverter;

public class Main {
    // Proposta: Declarar um array de 10 números inteiros e exibir na ordem inversa.

    static void main() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Array Invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
