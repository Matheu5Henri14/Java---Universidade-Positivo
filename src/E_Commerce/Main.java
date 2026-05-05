package E_Commerce;

import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Digite seu nome: ");
       String nome = sc.nextLine();
       System.out.println("Ola " + nome);

       System.out.println("====Bem vindo ao carrinho do nosso e-commerce====");
       int produto = 0;
       switch (produto){
           case 1:
               System.out.println("1-Carne");
               break;

           case 2:
               System.out.println("2-Queijo");
               break;

           case 3:
               System.out.println("3-Presunto");

               break;

           case 4:
               System.out.println("4-Frango");
               break;
       }

       sc.close();
    }
}
