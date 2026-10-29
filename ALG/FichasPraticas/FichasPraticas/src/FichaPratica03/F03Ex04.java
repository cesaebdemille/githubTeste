package FichaPratica03;

import java.util.Scanner;

public class F03Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

        int userInput, i=0;

        //leia um número inteiro
        System.out.print("insira um número inteiro: ");
        userInput = input.nextInt();

        //imprima os números inteiros de 0 até este número
        while (i <= userInput){
            System.out.println(i);
            i++;
        }


    }
}
