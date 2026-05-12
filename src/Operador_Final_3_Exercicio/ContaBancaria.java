package Operador_Final_3_Exercicio;

public class ContaBancaria {
    private String titular;
    private double saldo;
    final double TAXA = 2;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo > valor + TAXA) {
            saldo -= valor;
            saldo -= TAXA;
        } else {
            System.out.println("Saldo : " + saldo);
        }
    }
}


