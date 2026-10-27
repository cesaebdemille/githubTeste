package FichasPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare
        double nota01, nota02, nota03;
        double media, mediaPond;


        //ask
        System.out.println("Indique, as notas por ordem de ponderação");
        System.out.print("Indique,a primeira nota: ");
        nota01 = input.nextInt();

        System.out.print("Indique,a segunda nota: ");
        nota02 = input.nextInt();

        System.out.print("Indique,a terceira nota: ");
        nota03 = input.nextInt();

        //media
        media = (nota01 + nota02 + nota03) / 3;
        System.out.println("a média é: " + media);

        //media ponderada
        mediaPond = nota01 * 0.2 + nota02 * 0.3 + nota03 * 0.5;
        System.out.println("a média ponderada é: " + mediaPond);


    }
}
