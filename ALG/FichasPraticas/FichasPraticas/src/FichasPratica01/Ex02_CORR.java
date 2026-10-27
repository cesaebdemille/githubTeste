package FichasPratica01;

import java.util.Scanner;

public class Ex02_CORR {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis necessarias
        int num01;
        int num02;
        int resultado;


        //requisitar 2 valores user
        System.out.print("Insira o primeiro valor inteiro: " );
        num01 = input.nextInt();

        System.out.print("Insira o segundo valor inteiro: " );
        num02 = input.nextInt();

        //CALCULOS pela anulacao do passo anterior

        resultado = num01 + num02;
        System.out.println("A soma de ambos é: " + resultado );
        resultado = num01 - num02;
        System.out.println("A subtração de ambos é: " + resultado );
        resultado = num01 * num02;
        System.out.println("A multiplicação de ambos é: " + resultado );
        resultado = num01 / num02;
        System.out.println("A divisão de ambos é: " + resultado );



    }
}
