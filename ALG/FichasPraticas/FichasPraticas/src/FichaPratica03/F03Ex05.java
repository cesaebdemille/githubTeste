package FichaPratica03;

import java.util.Scanner;

public class F03Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem. Depois imprima a mensagem
        //x vezes, sendo x o número inteiro lido

        //declare Vars
        int i = 0, rep;
        String mensagem;

        //Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem.
        System.out.print("insira um número: ");
        rep = input.nextInt();

        // Limpar o buffer
        input.nextLine();

        System.out.print("insira uma mensagem: ");
        mensagem = input.nextLine();

        while (i < rep) {
            System.out.println(mensagem);
            i++;
        }

    }
}
