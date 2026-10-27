package FichaPratica02;

import java.util.Scanner;

public class F02Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare Vars
        int num01;

        //Ask User
        System.out.print("Insira 1 numero inteiro: ");
        num01 = input.nextInt();

        //averiguar par ou impar
        if (num01 == 0){
            System.out.println("É Zero");
        } else if (num01%2 == 0){
            System.out.println("par");
        } else System.out.println("ímpar");




    }
}
