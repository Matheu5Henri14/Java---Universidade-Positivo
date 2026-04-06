package Exercicio03;

public class Main{
    static void main(String[] args) {
        Carro veiculo1 = new Carro();
        Moto motinha = new Moto();
        
        veiculo1.marca = "Chevrolet";
        veiculo1.modelo = "Prisma";
        veiculo1.portas = 4;
        motinha.cilindradas = 556;

        System.out.println("Veiculos: " + veiculo1.marca);
        System.out.println("Veiculos: " + veiculo1.modelo);
        System.out.println("Veiculos: " + veiculo1.portas);

        System.out.println("Motos: " + motinha.cilindradas);



    }
}
