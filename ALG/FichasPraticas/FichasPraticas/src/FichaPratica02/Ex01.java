package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //vars
        int num01, num02;

        //UserRequest
        System.out.print("Introduza o primeiro número: ");
        num01 = input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num02 = input.nextInt();

        //comparar

        if(num01 == num02) {
            System.out.println("Os números são iguais");
        }else {
            if(num01 > num02) {
                System.out.println(num01 + " é o maior");
            } else {
                System.out.println(num02 + " é o maior");
            }

        }


    }
}
