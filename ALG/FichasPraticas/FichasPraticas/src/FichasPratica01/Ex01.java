package FichasPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //criar variaveis
        int num01, num02, soma;

        //requisitar valores user
        System.out.print("Insira um número: ");
        num01 = input.nextInt();

        System.out.print("Insira outro número: ");
        num02 = input.nextInt();

        // CALCULAR

        soma = num01 + num02;

        //Print result
        System.out.println("O resultado é: " +  soma);

    }
}
