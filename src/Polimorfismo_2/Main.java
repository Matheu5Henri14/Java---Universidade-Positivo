package Polimorfismo_2;

import Exercicio03.Moto;
import Exercicio03.Veiculo;

import java.util.ArrayList;

abstract class veiculo{
    public abstract double calcularAluguel(int dias);
}

class Carro extends Veiculo {
    @Override
    public double calcularAluguel(int dias) {
        return dias * 100;
    }

}

class Caminho extends Veiculo {
    @Override
    public double calcularAluguel(int dias){
        return dias * 150;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro());
        lista.add(new Moto());
        lista.add(new Caminho());

        for (Veiculo v : lista){
            System.out.println("Veiculos: " + v.calcularAluguel(15));
        }
    }
}
