package Operador_Final_3_Exercicio_2;

import java.util.ArrayList;

public class Main{
    static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Notebook",3000));
        lista.add(new Produto("Mouse",300));

        for (Produto p : lista){
            p.mostrarProduto();
        }
    }
}
