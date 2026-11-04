package FichaPratica04;

import java.util.Scanner;

public class F04Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //peça ao jogador 1 um valor entre 0 e 100
        //deverá permitir ao jogador 2 tentar
        //acertar no valor inserido pelo jogador 1
        //cada iteração, enquanto o valor não for descoberto, deverá informar
        //se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1
        //quando o
        //valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou

        int jog01, jog02=0, i;

        System.out.print("+++++jogador1++++\ninsira valor 1 a 100: ");
        jog01 = input.nextInt();

        for(i=0; jog01 != jog02; i++){
            System.out.print("******jogador 2******\ninsira valor 1 a 100: ");
            jog02 = input.nextInt();
                if (jog02 < jog01){
                    System.out.println(" valor é inferior ");
                } else if (jog01 < jog02){System.out.println(" valor é superior ");}

        }
        System.out.println("O jogador 2 identificou em " + i + " tentativas ");


    }
}
