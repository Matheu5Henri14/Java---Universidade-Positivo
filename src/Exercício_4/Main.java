package Exercício_4;

public class Main{
    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Matheus Evaristo", 25000);
        System.out.println("Titular: " + conta.titular + "\nSaldo: " + "$" + conta.saldo);
    }
}
