package Atividade_Produto;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class ProdutoFisico extends Produto {
    double peso;

    public ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    double tamanhoArquivoMB;

    public ProdutoDigital(String nome, double preco, double tamanhoArquivoMB) {
        super(nome, preco);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
}

class Carrinho {
    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto p : produtos) {
            System.out.println(p.nome + " - R$ " + p.preco);


        }
    }

    void calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        System.out.println("Total da compra: R$ " + total);
    }
}
