package FichaPratica02;

import java.util.Scanner;

public class F02Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare Vars
        int num01, num02, maior;

        //Ask User
        System.out.print("Insira 1 numero inteiro: ");
        num01 = input.nextInt();

        System.out.print("Insira 1 numero inteiro: ");
        num02 = input.nextInt();

        //Comparar

        if (num01 == num02){
            System.out.println("Os números são iguais");
        } else if (num01>num02) System.out.println( num02 + " "+ num01);
        else{
            System.out.println(  num01 + "  " +  num02);
        }

    }
}
