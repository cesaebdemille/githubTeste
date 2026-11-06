package FichaPratica05;

import java.util.Scanner;

public class F05Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente

        //vars criar dimensao do array
        int[] conjunto = new int[10];
        boolean crescente = true;

        //uso dos fors para encher arrays
        for (int i = 0; i < conjunto.length; i++) {

            System.out.print("escreva um numero inteiro na posição " + (i + 1) + " : ");
            conjunto[i] = input.nextInt();
        }

        //iniciar referencia
        for (int i = 1; i < conjunto.length; i++) {
            if(conjunto[i]<= conjunto[i-1]){
                crescente = false;
                break;
            }
        }
        if(crescente){
            System.out.println("crescente");
        }else{
            System.out.println("não - crescente");
        }



    }
}
