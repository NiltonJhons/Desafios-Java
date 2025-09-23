package Desafios.Nivel_2.Tabuada;

import javax.swing.*;

public class Main_2 {
    // Adição: Tela interativa simples com JOptionPane + StringBuilder

    static void main() {

        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(JOptionPane.showInputDialog("===== Gerador de Tabuada =====\nInsira um valor abaixo"));
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Até qual número deseja calcular a tabuada? Insira abaixo"));

        for (int i = 1; i < limite + 1; i++) {
            sb.append(num).append(" × ").append(i).append(" = ").append(num * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}