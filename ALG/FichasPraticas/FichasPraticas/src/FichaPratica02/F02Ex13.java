package FichaPratica02;

import java.util.Scanner;

public class F02Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.

        //declarar variaveis
        //por sugestao do inteliJ coloquei após input

        //pedir input
        System.out.println("introduza horário [hh mm]");
        int horas = input.nextInt();
        int minutos = input.nextInt();

        if (horas <=12){ // Manhã - Am
            System.out.println(horas + ":" + minutos + " AM" );
        }else {
            horas = horas-12;
            System.out.println(horas + ":" + minutos + " PM" );
        }


    }
}
