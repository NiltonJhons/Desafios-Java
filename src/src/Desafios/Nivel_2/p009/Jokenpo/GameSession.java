package Desafios.Nivel_2.p009.Jokenpo;

public class GameSession {
    String nome;
    String personagemJogador;
    String personagemComputador = "🖥️";
    String vidasJogadorImagem = "❤️❤️❤️";
    int vidasJogadorNumero = 3;

    String vidasComputadorImagem = "💙💙💙";
    int vidasComputadorNumero = 3;

    public GameSession(String nome, String personagemJogador) {
        this.nome = nome;
        this.personagemJogador = personagemJogador;
    }

    public String placar() {
        return String.format("""
            
            --------------------------
            |         PLACAR         |
            --------------------------
            | [%s] | Vidas: %s
            --------------------------
            | [%s] | Vidas: %s
            --------------------------""", this.personagemJogador, this.vidasJogadorImagem, this.personagemComputador,this.vidasComputadorImagem);
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

    public static String escolhaEmoji(int escolha) {
        switch (escolha) {
            case 1: return "🤛";
            case 2: return "✋";
            case 3: return "✌️";
            default: return "❌";
        }
    }

    public void atualizacaoGeral(int escolhaJogador, int escolhaComputador) {
        boolean jogadorVenceu = (
                (escolhaJogador == 1 && escolhaComputador == 3) ||
                        (escolhaJogador == 2 && escolhaComputador == 1) ||
                        (escolhaJogador == 3 && escolhaComputador == 2)
        );

        // Aplica o resultado da rodada
        if (jogadorVenceu) {
            atualizacaoJogadorVitoria();
        } else {
            atualizacaoComputadorVitoria();
        }

        // Atualiza a exibição das vidas (isso estava faltando no seu código)
        atualizarImagens();

        // Depois de atualizar, verifica se alguém perdeu todas as vidas
        if (vidasJogadorNumero <= 0 || vidasComputadorNumero <= 0) {
            encerrarJogo(jogadorVenceu);
        }
    }

    private void atualizarImagens() {
        switch (vidasJogadorNumero) {
            case 3 -> vidasJogadorImagem = "❤️❤️❤️";
            case 2 -> vidasJogadorImagem = "❤️❤️🖤";
            case 1 -> vidasJogadorImagem = "❤️🖤🖤";
            case 0 -> vidasJogadorImagem = "🖤🖤🖤";
        }

        switch (vidasComputadorNumero) {
            case 3 -> vidasComputadorImagem = "💙💙💙";
            case 2 -> vidasComputadorImagem = "💙💙🖤";
            case 1 -> vidasComputadorImagem = "💙🖤🖤";
            case 0 -> vidasComputadorImagem = "🖤🖤🖤";
        }
    }

    private void encerrarJogo(boolean jogadorVenceu) {
        if (jogadorVenceu) {
            personagemComputador = "☠️";
            System.out.printf("""
                
                --------------------------------
                |         Fim de jogo          |
                --------------------------------
                | 🥳 Parabéns! Você venceu 🥳 |
                --------------------------------
                """);
        } else {
            personagemJogador = "☠️";
            System.out.printf("""
                
                -------------------------------
                |         Fim de jogo          |
                -------------------------------
                |      🐍 Você perdeu 🐍      |
                -------------------------------
                """);
        }
    }

    private void atualizacaoJogadorVitoria() {
        System.out.printf("""
            
            === %s [%s] venceu a rodada! ===
            """, nome, personagemJogador);
        vidasComputadorNumero--;
    }

    private void atualizacaoComputadorVitoria() {
        System.out.printf("""
            === Computador [%s] venceu a rodada! ===
            """, personagemComputador);
        vidasJogadorNumero--;
    }
}
