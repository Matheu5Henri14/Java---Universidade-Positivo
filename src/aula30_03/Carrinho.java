package aula30_03;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void ListaProduto(Produto produtos) {
        this.produtos.add(produtos);
    }

    public void ListaProduto() {
        for (Produto p : this.produtos) {
            System.out.println(p.nome + "" + p.preço);
        }
    }

    public void QuantidadeProdutos() {
        var total = 0.0;
        for (Produto p : this.produtos) {
            total += p.preço;
        }
        System.out.println("Quantidade Produtos = " + total);
    }
}
