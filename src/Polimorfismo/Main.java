package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();

        v1.mover();
        v2.mover();
    }
}
