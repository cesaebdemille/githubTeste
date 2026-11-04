package FichaPratica03;

import java.util.Scanner;

public class F03Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            //posso resolver inicializando a [-1,1]
        int i=0, soma=1, cont=-1;
        boolean aux;

        //Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //deve dizer a média dos números introduzidos (excluindo o -1).



            while (i != -1) {
                System.out.print("insira número (int/pos/neg excepto 0)");
                i = input.nextInt();
                soma += i;
                cont +=1 ;
                System.out.println("in-soma" + soma);
                System.out.println("in-cont " + cont);
                   }

            System.out.println(soma);
            System.out.println(cont);
    }
}