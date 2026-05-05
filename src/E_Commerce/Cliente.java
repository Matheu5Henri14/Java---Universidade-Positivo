package E_Commerce;

import static Encapsulamento_1.Aluno.getNome;

public class Cliente {
    private String nome;
    private String carrinho;


    public Cliente(String nome ) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}


