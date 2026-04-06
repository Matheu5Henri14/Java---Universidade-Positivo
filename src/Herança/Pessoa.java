package Herança;

public class Pessoa {
    String nome;
    int idade;
}

class Aluno extends Pessoa{
    String curso;
}

class Professor extends Pessoa{
    String disciplina;
}