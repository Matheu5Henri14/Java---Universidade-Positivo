package Encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
            System.out.println("Sua Idade é valida: "  + idade);
        }else{
            System.out.println("Idade invalida.");
        }
    }
}

class Main {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(10);
    }
}
