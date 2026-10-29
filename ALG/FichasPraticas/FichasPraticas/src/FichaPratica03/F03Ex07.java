package FichaPratica03;

import java.util.Scanner;

public class F03Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //imprima os números inteiros de 1 a 100 inclusive
        //no final seu somatório

        int i=0, soma= 0;

        while (i<=100){
            System.out.println(i);
            soma += i;
            i++;
        }
        System.out.println(soma);
    }
}
