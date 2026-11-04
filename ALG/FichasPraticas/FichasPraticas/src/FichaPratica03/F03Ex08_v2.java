package FichaPratica03;

import java.util.Scanner;

public class F03Ex08_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.

        int num, anterior, sucessor;

        System.out.print("insira um numero:");
        num = input.nextInt();

        anterior = num - 5;
        sucessor = num + 5;

        while (anterior<= sucessor){
            System.out.println(anterior);
        }
        anterior++;
    }
}
