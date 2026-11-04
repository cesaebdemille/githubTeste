package FichaPratica04;

import java.util.Objects;
import java.util.Scanner;

public class F04Ex04   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        peça ao utilizador dois valores
//        e um carácter(+, -, *, /).
//        Apresente o resultado
//        No  final,
//        deverá perguntar ao utilizador
//        se deseja repetir, permitindo-lhe efetuar novos cálcu
//        continuar? (introduza s/n).

        int num01, num02;
        String operacao, continuar;


        do {
            System.out.println("primeiro valor: ");
            num01 = input.nextInt();

            System.out.println("segundo valor: ");
            num02 = input.nextInt();

            System.out.println("operação (+, -, *, /): ");
            operacao = input.next();

            switch (operacao){
                case "+":
                    System.out.println(num01+num02);
                break;
                case "-":
                    System.out.println(num01-num02);
                    break;
                case "/":
                    System.out.println(num01/num02);
                    break;
                case "*":
                    System.out.println(num01*num02);
                    break;

            }

            System.out.println("continuar? (introduza s/n): ");
            continuar = input.next();

        }while (!Objects.equals(continuar, "n"));

    }
}
