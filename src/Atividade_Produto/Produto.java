package Atividade_Produto;

import E_Commerce.Cliente;

import java.util.ArrayList;


public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return this.preco;
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

class Pedido{
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
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

            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso " + pf.peso + "kg");
            }

            if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("MB " + pd.tamanhoArquivoMB);
            }
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
