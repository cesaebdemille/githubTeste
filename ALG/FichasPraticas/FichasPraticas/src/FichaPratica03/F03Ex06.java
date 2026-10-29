package FichaPratica03;

import java.util.Scanner;

public class F03Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // leia dois números inteiros, representando os valores início e fim de um intervalo e imprima
        //os números inteiros neste intervalo

        int inicio, fim, i;

        System.out.println("insira o início da sequência");
        inicio = input.nextInt();

        System.out.println("insira o fim da sequência");
        fim = input.nextInt();

        i = inicio;

        while (i < fim){
            System.out.println(i);
            i++;
        }





    }
}
