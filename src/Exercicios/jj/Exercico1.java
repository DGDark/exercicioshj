package Exercicios.jj;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Informe o comprimento da piscina: ");
        double comprimento = scanner.nextInt();

        System.out.println("Informe a largura da piscina:");
        double largura = scanner.nextInt();

        System.out.println("Informe a profundidade da piscina:");
        double profundidade = scanner.nextInt();

        double ml1 = 1000;
        double cauculo = comprimento * largura * profundidade ;
        double caucloFinal = cauculo * ml1;

        System.out.println("A piscina comporta :  " + caucloFinal + "litros de água");





    }
}
