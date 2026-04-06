package Atividade_Produto;

public class Main {
    public static void main(String[] args) {
        ProdutoFisico p3 = new ProdutoFisico("Monitor", 1200, 3.0);
        ProdutoDigital p4 = new ProdutoDigital("GTA V", 200, 80000);

        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse", 100);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);

        carrinho.listarProdutos();
        carrinho.calcularTotal();
    }
}
