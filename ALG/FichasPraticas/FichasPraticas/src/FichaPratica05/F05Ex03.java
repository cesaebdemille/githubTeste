package FichaPratica05;

import java.util.Scanner;

public class F05Ex03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //lê um array de tamanho 10
        // e encontra o maior elemento

        //vars criar dimensao do array
        int[] conjunto = new int[10];
        int max=0;


        //uso dos fors para encher arrays
        for (int i=0; i<conjunto.length; i++ ) {

            System.out.print("escreva um numero inteiro na posição " + (i + 1) + " : ");
            conjunto[i] = input.nextInt();

            //current champion

            if(max < conjunto[i]){
                max = conjunto[i];
            }
//
            System.out.println(max);
        }






    }
}
