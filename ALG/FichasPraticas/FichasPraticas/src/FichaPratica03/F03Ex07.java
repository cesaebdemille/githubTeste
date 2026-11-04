package FichaPratica03;

import java.util.Scanner;

public class F03Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //imprima os números inteiros de 1 a 100 inclusive
        //no final seu somatório

        int i=1, soma= 0;

        while (i<=100){
            System.out.println(i);
            soma += i;
            //i +=\d; isolado [* | / | - | %]
            //post-increment operator
            //Pre-Increment (++i)
            //In simple standalone statements (e.g., i++; vs i += 1;), the final state of i is identical, but the expression results differ
            //System.out.println(i++);
            //System.out.println(i); ----> 5 6
            //System.out.println(++1);
            //System.out.println(i); ----> 6 6
            // a += a |  variável de acumulação
            i++;
        }
        System.out.println(soma);
    }
}
