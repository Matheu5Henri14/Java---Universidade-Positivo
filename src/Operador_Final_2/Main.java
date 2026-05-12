package Operador_Final_2;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        final double MEDIA_MINIMA = 7;

        ArrayList<Double> nota = new ArrayList<>();
        nota.add(8.0);
        nota.add(7.5);
        nota.add(9.0);

        double soma = 0;
        for (double n : nota){
            soma += n;
        }

        double media = soma/nota.size();

        System.out.println("Media: "+media);

        if (media >= MEDIA_MINIMA){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
