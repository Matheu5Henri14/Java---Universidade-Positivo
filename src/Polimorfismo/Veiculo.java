package Polimorfismo;

abstract class Veiculo {

    public abstract void mover();

}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro andando");
    }

}

class Moto extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Moto andando");
    }

}

