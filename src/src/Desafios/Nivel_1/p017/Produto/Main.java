package Desafios.Nivel_1.p017.Produto;

public class Main {
    static void main() {
        Produto p1 = new Produto("Notebook", 4356.89, 2, 25);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 10;
        p2.quantidade = 10;
        p2.desconto = 10;

        System.out.printf("""
                ----------
                Produto 1
                ----------
                Nome: %s
                Preço: %.2f
                Quantidade: %d
                Desconto: %d
                Preço Final: %.2f
                """, p1.nome, p1.preco, p1.desconto, p1.quantidade, p1.precoFinal());

        System.out.printf("""
                ----------
                Produto 2
                ----------
                Nome: %s
                Preço: %.2f
                Quantidade: %d
                Desconto: %d
                Preço Final: %.2f
                """, p2.nome, p2.preco, p2.desconto, p2.quantidade, p2.precoFinal());
    }
}
