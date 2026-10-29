package FichaPratica02;

import java.util.Scanner;

public class F02Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //procurar resolução com operadores lógicos
        //orientar os < para o mesmo lado preferencialmente

        System.out.println( "insira 3 numeros, e finalize escolhendo [C] para apresentar em ordem crescente e [D] para decrescente");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        String escolha = input.next();

        //nested if A menor que todos
        if (a<b && a<c) {
            if (b<c) {
                System.out.println(a + " " + b + " " + c);// A B C
            }else{
                System.out.println(a + " " + c + " " + b);// A C B
            }
        }



    }

}
