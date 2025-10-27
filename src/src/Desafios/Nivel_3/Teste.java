package Desafios.Nivel_3;

public class Teste {
    static void main() {
        String texto = "123aaBC";

        System.out.println(!texto.matches(".*[a-zA-Z].*"));
    }
}
