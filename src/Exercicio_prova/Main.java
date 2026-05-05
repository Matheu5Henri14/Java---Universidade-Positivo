package Exercicio_prova;

import java.util.ArrayList;



class Clientee{

    private String nome;

    private String cpf;



    public Clientee(String nome, String cpf){

        this.nome = nome;



        if(cpf != null && !cpf.isEmpty()){

            this.cpf = cpf;

        }else{

            System.out.println("CPF inválido");

        }

    }



    public String getNome(){

        return nome;

    }



    public String getCpf(){

        return cpf;

    }

}



class Carro{

    private String marca;

    private String modelo;

    private double preco;



    public Carro(String marca, String modelo, double preco){

        this.marca = marca;

        this.modelo = modelo;



        if(preco > 0){

            this.preco = preco;

        }else{

            System.out.println("Preço inválido");

            //this.preco = 0;

        }

        //setPreco(preco);

    }



    public String getMarcaa(){

        return marca;

    }

    public String getModeloo(){

        return modelo;

    }

    public double getPrecoo(){

        return preco;

    }

    public void aplicarDesconto(double percentual){

        if(percentual > 0 && percentual <= 100){

            preco -= preco * (percentual/100);

        }else{

            System.out.println("Percentual inválido");

        }

    }

}



class Estoque{

    private ArrayList<Carro> carros;



    public Estoque(){

        carros = new ArrayList<>();

    }

    public void adicionarCarro(Carro carro){

        carros.add(carro);

    }

    public void listarCarro(){

        System.out.println("=====ESTOQUE====");



        for(Carro c : carros){

            System.out.println(c.getMarcaa() + " - " + c.getModeloo() + " - R$" + c.getPrecoo());

        }

    }



    public double calcularTotalEstoque(){

        double total = 0;

        for(Carro c: carros){

            total += c.getPrecoo();

        }

        return total;

    }

}



class Venda{

    private Clientee cliente;

    private Carro carro;



    public Venda(Clientee cliente, Carro carro){

        this.cliente = cliente;

        this.carro = carro;

    }



    public void mostrarResumoVenda(){

        System.out.println("\n====VENDA====");

        System.out.println("Cliente: " +cliente.getNome());

        System.out.println("Carro: " +carro.getMarcaa() + " " +carro.getModeloo());

        System.out.println("Preço: " +carro.getPrecoo());

    }

}



public class Main{



    public static void main(String[] args) {



        Clientee cliente = new Clientee("Maria", "432789289");



        Carro c1 = new Carro("Caoa Chery" , "Tiggo 7 sport", 150000);

        Carro c2 = new Carro("Fiat", "Argo", 80000);

        Carro c3 = new Carro("Toyota", "Corolla", 200000);



        c1.aplicarDesconto(15);



        Estoque estoque = new Estoque();



        estoque.adicionarCarro(c1);

        estoque.adicionarCarro(c2);

        estoque.adicionarCarro(c3);



        estoque.listarCarro();



        System.out.println("Valor total do estoque: R$ " +estoque.calcularTotalEstoque());



        Venda venda = new Venda(cliente, c1);



        venda.mostrarResumoVenda();



    }

}
