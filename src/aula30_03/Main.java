package aula30_03;

public class Main {
    public static void main(String[] args) {
        var Carrinho = new Carrinho();

        Carrinho.produtos.add(new Produto("Camiseta ", 15.0));
        Carrinho.produtos.add(new Produto("Shorts ", 20.0));
        Carrinho.produtos.add(new Produto("Camisa ", 25.0));
        Carrinho.produtos.add(new Produto("Calça ", 30.0));

        Carrinho.ListaProduto();

        Carrinho.QuantidadeProdutos();
    }
}