package FichaPratica03;

import java.util.Scanner;

public class F03Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.

        int userInput, i, lim;

        System.out.print("insira um numero:");
        userInput = input.nextInt();

        i = userInput - 5;
        lim = userInput + 5;

        while (i<= lim){
            System.out.println(i);
            i++;
        }

    }
}
