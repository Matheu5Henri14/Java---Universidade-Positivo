package Encapsulamento_2;

import java.util.Scanner;

public class ContaBancaria {
    private static String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        setSaldo(saldo);
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }else {
            System.out.println("!Saldo invalido!");
            this.saldo = 0;
        }
    }

}

class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do titular: ");
        String titular = sc.nextLine();


        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Ola Titular: " + titular);
        System.out.println("Seu Saldo é: " + "R$ " + saldo);
    }
}