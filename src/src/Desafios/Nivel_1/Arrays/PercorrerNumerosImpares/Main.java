package Desafios.Nivel_1.Arrays.PercorrerNumerosImpares;

public class Main {
    // Proposta: Receber um array de inteiros, percorrer e contar quantos são ímpares.

    static void main() {
        int[] numeros = {4, 74, 91, 63, 3, 37, 49, 12, 86, 45};
        int contadorDeImpar = 0;

        for (int n : numeros) {
            if (n % 2 == 1) {
                contadorDeImpar++;
            }
        }

        System.out.printf("Há %d números impares no array.", contadorDeImpar);
    }
}
