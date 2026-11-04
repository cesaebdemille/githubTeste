package FichaPratica03;

import java.util.Scanner;

public class F03Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//leia uma sequência de números inteiros do utilizador
// e determine se a sequência está em ordem crescente.

        int limite, contador = 1, numeroAnterior, numeroAtual;
        boolean crescente = true;

        System.out.print("quantos numeros deseja inserir: ");
        limite = input.nextInt();

        System.out.print("inserira um número: ");
        numeroAnterior = input.nextInt();

        //FLAG

        while (contador < limite) {
            System.out.println("insira um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior) {
                crescente = false;
            }

            numeroAnterior = numeroAtual;
            contador++;
        }

        if (crescente == true) {
            System.out.println("crescente");
        } else {
            System.out.println("não crescente");
        }

    }
}
