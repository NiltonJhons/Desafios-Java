package Desafios.Nivel_2.p008_VerificadorCPF;

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
            verificadorNumerico(cpf); // Chama próximo metodo
        } else {
            System.out.println("CPF Inválido - Posição de pontuação inadequada.");
        }
    }

    // Verifica se há repetição númerica ou padrão
    private static void verificadorNumerico(String cpf) {
        String numeros = cpf.replaceAll("\\D", ""); // Remove a pontuação

        if (numeros.chars().distinct().count() <= 3) {
            System.out.println("CPF Inválido - Valores repetidos.");
        } else if (numeros.equals("12345678910") || numeros.equals("01234567890")) {
            System.out.println("CPF Inválido - Padrão detectado.");
        } else {
            digitosVerificadores(numeros);
        }
    }

    // Verificando o algoritmo de Módulo 11
    private static void digitosVerificadores(String cpf) {
        int[] digitos = new int[9];
        int[] ultimosDigitos = new int[2];

        // Separar os 9 primeiros e os 2 últimos
        for (int i = 0; i < cpf.length(); i++) {
            int valor = Character.getNumericValue(cpf.charAt(i));
            if (i < 9) {
                digitos[i] = valor;
            } else {
                ultimosDigitos[i - 9] = valor;
            }
        }

        // Cálculo do primeiro dígito verificador (D1)
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
        }
        int resto1 = soma1 % 11;
        int D1 = (resto1 < 2) ? 0 : 11 - resto1;

        // Cálculo do segundo dígito verificador (D2)
        int soma2 = D1 * 2;
        for (int i = 0; i < 9; i++) {
            soma2 += digitos[i] * (11 - i);
        }
        int resto2 = soma2 % 11;
        int D2 = (resto2 < 2) ? 0 : 11 - resto2;

        // Verifica se o CPF é válido
        boolean valido = (D1 == ultimosDigitos[0] && D2 == ultimosDigitos[1]);

        System.out.printf("""
                Dígitos verificadores: [%d | %d]
                %s
                """, D1, D2, valido ? "O CPF inserido está correto. Atende a todas as normas." : "O CPF é Inválido.");
    }
}