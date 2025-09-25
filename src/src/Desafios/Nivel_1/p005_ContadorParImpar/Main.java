package Desafios.Nivel_1.p005_ContadorParImpar;

public class Main {
    // Proposta: Receber um array de inteiros, percorrer, contar e exibir quantos números pares e impares há.

    static void main() {
        int[] numeros = {4, 74, 91, 63, 3, 37, 49, 12, 86, 45};
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        System.out.printf("Há %d números pares e %d números impares no array.", contadorPar, contadorImpar);
    }
}
