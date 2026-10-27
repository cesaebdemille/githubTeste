package FichasPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis necessarias
        int num01;
        int num02;
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        //requisitar 2 valores user
        System.out.print("Insira o primeiro valor inteiro: " );
        num01 = input.nextInt();

        System.out.print("Insira o segundo valor inteiro: " );
        num02 = input.nextInt();

        //CALCULOS

        soma = num01 + num02;
        subtracao = num01 - num02;
        multiplicacao = num01 * num02;
        divisao = num01 / num02;

        // mostrar rsultados
        System.out.println("A soma de ambos é: " + soma );
        System.out.println("A subtração de ambos é: " + subtracao );
        System.out.println("A multiplicação de ambos é: " + multiplicacao );
        System.out.println("A divisão de ambos é: " + divisao );
    }
}
