package Exercicio_6;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario =  (salario * 0.10) + salario;
    }
}
