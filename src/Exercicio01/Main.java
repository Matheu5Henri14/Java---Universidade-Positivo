package Exercicio01;

public class Main{
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Carlinhos";
        funcionario1.idade = 56;
        funcionario1.salario = 30000;

        System.out.println(funcionario1.nome);
        System.out.println(funcionario1.idade);
    }

}
