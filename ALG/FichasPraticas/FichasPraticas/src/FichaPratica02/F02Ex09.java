package FichaPratica02;

import java.util.Scanner;

public class F02Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

                //declarar vars
        int a,b,c;

        //ler
        System.out.print("insira 1.º valor: ");
        a = input.nextInt();

        System.out.print("insira 2.º valor: ");
        b = input.nextInt();

        System.out.print("insira 3.º valor: ");
        c = input.nextInt();

        //comparar TENTAR ELSEIF
        if (a<b && a<c){
            System.out.print("menor é A");
        } else if (b<a && b<c) {
            System.out.print("menor é A");
        }

    }
}
