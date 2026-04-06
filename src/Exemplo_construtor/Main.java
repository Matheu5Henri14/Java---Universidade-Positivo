package Exemplo_construtor;

public class Main {
    static void main(String[] args) {
        Pessoa p = new Pessoa("Maria",25);

        System.out.println("\n Nome: " + p.nome + "\n Idade: " + p.idade);

        Aluno a = new Aluno("Marcos Silvino", 22);

        System.out.println("\nNome: " + a.nome + "\nIdade: " + a.idade);
        
    }
}
