package FichasPratica01;

import java.util.Scanner;

public class Ex08_aux {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int segundos, minutos, horas;
        int segundosTotal = 0;
        int minutosTotal = 0;
        int horasTotal = 0;

        //musica01

        System.out.print("Introduza os segundos da música 1: ");
        segundos = input.nextInt();
       segundosTotal = segundosTotal + segundos;

        System.out.print("Introduza os minutos da música 1: ");
        minutos = input.nextInt();
        minutosTotal = minutosTotal + minutos;

        //musica02

        System.out.print("Introduza os segundos da música 2: ");
        segundos = input.nextInt();
        segundosTotal = segundosTotal + segundos;

        System.out.print("Introduza os minutos da música 2: ");
        minutos = input.nextInt();
        minutosTotal = minutosTotal + minutos;

        //musica03

        System.out.print("Introduza os segundos da música 3: ");
        segundos = input.nextInt();
        segundosTotal = segundosTotal + segundos;

        System.out.print("Introduza os minutos da música 3: ");
        minutos = input.nextInt();
        minutosTotal = minutosTotal + minutos;

        //musica04

        System.out.print("Introduza os segundos da música 4: ");
        segundos = input.nextInt();
        segundosTotal = segundosTotal + segundos;

        System.out.print("Introduza os minutos da música 4: ");
        minutos = input.nextInt();
        minutosTotal = minutosTotal + minutos;

        //musica05

        System.out.print("Introduza os segundos da música 5: ");
        segundos = input.nextInt();
        segundosTotal = segundosTotal + segundos;

        System.out.print("Introduza os minutos da música 5: ");
        minutos = input.nextInt();
        minutosTotal = minutosTotal + minutos;


        //conversao

        minutosTotal = minutosTotal + segundosTotal/60;
        horasTotal = minutosTotal/60;
        segundosTotal = segundosTotal%60;



        System.out.print("A soma dos albuns tem: " + horasTotal + ": ");
        System.out.print(minutosTotal%60 + ": ");
        System.out.print(segundosTotal%60);
    }
}
