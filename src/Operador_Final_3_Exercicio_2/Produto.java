package Operador_Final_3_Exercicio_2;

public class Produto {
    String nome;
    double preco;
    final double IMPOSTO = 0.75;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
        return preco + (preco * IMPOSTO);
    }

    public void mostrarProduto(){
        System.out.println(nome + " R$" + calcularPrecoFinal());
    }
}

