package FichaPratica03;

import java.util.Scanner;

public class F03Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        // exclusivo LOL
        //Suponha que o número lido da entrada será maior que 2.

        //decl

        int inicio = 2, i , inteiro;

        System.out.print("insira um número acima de 2");
        inteiro = input.nextInt();

        if (inteiro%2 == 0){
            inteiro -=2;
            while (inicio <= inteiro){
                System.out.println(inicio+=2);
            }
        }else {
            inteiro -=1;
            while (inicio < inteiro){
            System.out.println(inicio +=2);}
               }






    }
}
