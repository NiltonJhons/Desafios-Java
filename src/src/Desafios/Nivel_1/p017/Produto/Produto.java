package Desafios.Nivel_1.p017.Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    int desconto;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public double precoFinal() {
        double total = this.preco * this.quantidade;
        double descontoAplicado = (total * this.desconto) / 100;
        return total - descontoAplicado;
    }
}
