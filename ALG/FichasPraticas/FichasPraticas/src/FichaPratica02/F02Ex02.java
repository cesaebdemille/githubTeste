package FichaPratica02;

import java.util.Scanner;

public class F02Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar var
        double salario, taxa;

        //pedir Vars
        System.out.print("Seu salário aqui: ");
        salario = input.nextInt();

        if (salario > 25000) {
            System.out.println(salario * 0.4 + " taxa 40%");
        }else{
            if (salario > 20000 ) {
                System.out.println(salario * 0.35 + " taxa 35%");
            }if (salario > 15000 && salario <= 20000 ) {
                System.out.println(salario * 0.30 + " taxa 30%");
            }if (salario <= 15000) {
                System.out.println(salario * 0.20 + " taxa 20%");}


        }


    }
}