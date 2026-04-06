package Exercicio_10;

public class Usuario {
    String nome;
    String email;
    String senha;

    public Usuario(String nome, String email, String senha) {

        if (senha.length() >= 6){
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }else{
            System.out.println("A senha deve conter no mínimo 6 caracteres");
        }

    }
}

