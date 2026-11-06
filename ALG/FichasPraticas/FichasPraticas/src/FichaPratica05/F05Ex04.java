package FichaPratica05;

import java.util.Scanner;

public class F05Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //lê um array de tamanho 10
        // e encontra o menor elemento

        //vars criar dimensao do array
        int[] conjunto = new int[10];



        //uso dos fors para encher arrays
        for (int i = 0; i < conjunto.length; i++) {

            System.out.print("escreva um numero inteiro na posição " + (i + 1) + " : ");
            conjunto[i] = input.nextInt();
        }

        int min = conjunto[0];

        //for all in array, detect champion
        for (int i = 1; i < conjunto.length; i++) {
            if (min > conjunto[i]) {
                min = conjunto[i];
            }
        }

        System.out.println("o valor menor é: " + min);

        }
    }
