package Encapsulamento_1;

public class Aluno {
    private static String nome;
    private  int idade;

    public static String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
            System.out.println("Sua idade foi aceita, sua idade é: " + idade + " Anos");
        }else{
            System.out.println("Idade não aceita, valor negativo!");
        }
    }
}

class Main{
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Marquinhos");
        System.out.println(Aluno.getNome());
        aluno.setIdade(88);
    }
}