package Desafios.Nivel_2.p009.Jokenpo;

import java.util.Random;

public class Instancias {
    String nome;
    String vidasJogadorImagem = "❤️❤️❤️";
    int vidasJogadorNumero = 3;

    String vidasComputadorImagem = "🤍🤍🤍";
    int vidasComputadorNumero = 3;

    public Instancias(String nome) {
        this.nome = nome;
    }

    public String placar(String personagemJogador) {
        return String.format("""
            --------------------------
            |         PLACAR         |
            --------------------------
            | [%s] | Vidas: %s
            --------------------------
            | [🖥️] | Vidas: %s
            --------------------------""", personagemJogador, this.vidasJogadorImagem, this.vidasComputadorImagem);
        }

        public String escolha() {
            return String.format("""
                ---------------------------------------------
                | Escolha um número correspodente a sua mão |
                ---------------------------------------------
                |    1  ->  🤛   (Pedra)                    |
                |    2  ->  ✋   (Papel)                    |
                |    3  ->  ✌️   (Tesoura)                  |
                ---------------------------------------------
                | Eu escolho o número -> ´""");
        }

        public static String escolhaJogadorEmoji(int escolhaJogador) {
            switch (escolhaJogador) {
                case 1: return "🤛";
                case 2: return "✋";
                case 3: return "✌️";
            }
            return "ERROR";
        }

    public static String escolhaComputadorEmoji(int escolhaComputador) {
        switch (escolhaComputador) {
            case 1: return "🤛";
            case 2: return "✋";
            case 3: return "✌️";
        }
        return "ERROR";
    }
}
