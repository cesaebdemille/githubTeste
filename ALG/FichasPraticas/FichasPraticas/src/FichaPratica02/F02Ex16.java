package FichaPratica02;

import java.util.Scanner;

public class F02Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //lê um valor em euros (múltiplo de 5)
//calcula qual o menor número possível de notas
//de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto.
//Escrever o valor lido e a relação de notas necessárias.

        int valor, notas;


        System.out.println("Introduza um valor múltiplo de 5");
        valor = input.nextInt();


        if (valor%5 == 0) {
            notas = valor / 200;
            System.out.println("Notas de 200€: " + notas);

            valor = valor % 200;

            notas = valor / 100;
            System.out.println("Notas de 100€: " + notas);

            valor = valor % 100;

            notas = valor / 50;
            System.out.println("Notas de 50€: " + notas);

            valor = valor % 50;

            notas = valor / 20;
            System.out.println("Notas de 20€: " + notas);

            valor = valor % 20;

            notas = valor / 10;
            System.out.println("Notas de 10€: " + notas);

            valor = valor % 10;

            notas = valor / 5;
            System.out.println("Notas de 5€: " + notas);
        }else System.out.println("não damos trocos");



    }
}
