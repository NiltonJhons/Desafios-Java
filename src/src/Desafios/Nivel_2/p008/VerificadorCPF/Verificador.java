package Desafios.Nivel_2.p008.VerificadorCPF;

public class Verificador {

    // Verifica se contém 2 pontos e 1 traço
    public static void verificadorPontuacao(String cpf) {
        int qtdTraco = 0;
        int qtdPonto = 0;

        for (int i = 0; i < cpf.length(); i++) {
            char c = cpf.charAt(i);
            if (c == '.') qtdPonto++;
            if (c == '-') qtdTraco++;
        }

        if (qtdPonto == 2 && qtdTraco == 1) {
            verificadorPosicao(cpf); // Chama próximo metodo
        } else {
            System.out.println("CPF Inválido - Não contém a pontuação adequada.");
        }
    }

    // Verifica se as posições dos pontos e do traço estão corretas
    private static void verificadorPosicao(String cpf) {
        int posicaoCorreta = 0;

        for (int i = 0; i < cpf.length(); i++) {
            char c = cpf.charAt(i);

            if (i == 3 || i == 7) {
                if (c == '.') posicaoCorreta++;
            }
            if (i == 11) {
                if (c == '-') posicaoCorreta++;
            }
        }

        if (posicaoCorreta == 3) {
            verificadorNumerica(cpf); // Chama próximo metodo
        } else {
            System.out.println("CPF Inválido - Posição de pontuação inadequada.");
        }
    }

    // Verifica se há repetição númerica ou padrão
    private static void verificadorNumerica(String cpf) {
        String numeros = cpf.replaceAll("\\D", ""); // Remove a pontuação

        if (numeros.chars().distinct().count() <= 3) {
            System.out.println("CPF Inválido - Valores repetidos.");
        } else if (numeros.equals("12345678910") || numeros.equals("01234567890")) {
            System.out.println("CPF Inválido - Padrão detectado.");
        } else {
            System.out.println("O CPF inserido está correto. Atende a todas as normas.");
        }
    }
}
