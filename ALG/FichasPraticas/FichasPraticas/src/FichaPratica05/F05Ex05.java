package FichaPratica05;

import java.util.Scanner;

public class F05Ex05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // lê um array de tamanho 10 e
        // calcula a média dos elementos

        //vars criar dimensao do array
        int[] conjunto = new int[10];
        int sum = 0, media;

        //uso dos fors para encher arrays
        for (int i = 0; i < conjunto.length; i++) {

            System.out.print("escreva um numero inteiro na posição " + (i + 1) + " : ");
            conjunto[i] = input.nextInt();
        }


        for (int i = 0; i < conjunto.length; i++) {
            sum += conjunto[i];
        }

        media = sum/conjunto.length;
        System.out.println(media);
    }
}
