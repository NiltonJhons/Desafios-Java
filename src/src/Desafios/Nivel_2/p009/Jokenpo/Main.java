package Desafios.Nivel_2.p009.Jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        GameSession sistema = null;
        String[] emojisReservados = {"🐯", "🖥️", "❤️", "💙", "🖤", "🤛", "✋", "✌️", "❌", "😛", "🥳", "☠️", "🐍"}; // Lista de emojis reservados

        System.out.println("""
                --------------------------
                | 🐯  Jogo - Jokenpô  🐯 |
                --------------------------
                |     Seja Bem-Vindo     |
                --------------------------
                """);

        System.out.print("Insira o seu nome: ");
        String nome = input.nextLine();

        if (!nome.matches("[\\p{L}\\p{N}]+")) { // Verifica se o nome do usuário contém apenas letras e números (padrão unicode completo)
            System.out.println("Seu nome não atende aos requisitos. Portanto, lhe será dado o nome padrão.\n");
            nome = "Jogador_Legal";
        }

        System.out.printf("Olá, %s. Escolha o seu personagem! ", nome);

        // Verifica se o emoji é reservado ou se o usuário digitou mais de um
        while (true) {
            System.out.print("\nDigite um emoji: ");
            String personagemJogador = input.nextLine();
            personagemJogador = personagemJogador.replaceAll("\\s+", ""); // Remove os espaços, tabs, quebra de linha...

            boolean reservado = false;

            for (String emoji : emojisReservados) {
                if (emoji.equals(personagemJogador)) {
                    reservado = true;
                    break;
                }
            }

            if (reservado) {
                System.out.println("\nO emoji inserido está reservado 🫤. Escolha outro.");
            } else {
                if (personagemJogador.codePointCount(0, personagemJogador.length()) == 1 && !personagemJogador.matches("\\p{Alnum}")) {
                    sistema = new GameSession(nome, personagemJogador);
                    break;
                } else {
                    System.out.println("\nDigite apenas um único emoji 🫤.");
                }
            }
        }

        // Imprime o placar inicial
        System.out.println(sistema.placar());

        while (sistema.vidasJogadorNumero > 0 && sistema.vidasComputadorNumero > 0) { // Enquanto ambos (jogador e computador) estiverem com vida, o jogo irá continuar
            System.out.print(sistema.escolha());
            int escolhaJogador = input.nextInt();
            int escolhaComputador = random.nextInt(3) + 1;

            System.out.printf("""
                    -----------------------
                    | %s -> %s | %s <- %s |
                    -----------------------
                    """, sistema.personagemJogador, GameSession.escolhaEmoji(escolhaJogador), GameSession.escolhaEmoji(escolhaComputador), sistema.personagemComputador);

            if (escolhaJogador == 1 && escolhaComputador == 1 || escolhaJogador == 2 && escolhaComputador == 2 || escolhaJogador == 3 && escolhaComputador == 3) {
                System.out.println("\n😛 === EMPATE === 😛");
            } else {
                sistema.atualizacaoGeral(escolhaJogador, escolhaComputador); // Imprime o vencedor da rodada, atualiza o sistema de vidas,
                System.out.println(sistema.placar()); // Exibe o placar atualizado
            }
        }

        input.close();
    }
}
