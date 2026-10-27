package FichasPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor01, valor02, valor03;
        System.out.println("Indique, a primeira variavel: ");
        valor01 = input.nextInt();

        System.out.println("Indique, a segunda variavel: ");
        valor02 = input.nextInt();

        //permuta
        valor01 = valor02 * valor01;
        System.out.println( valor01 +" " + valor02);
        valor02 = valor01 / valor02;
        System.out.println( valor01 +" " + valor02);
        valor01 = valor01 / valor02;
        System.out.println( valor01 +" " + valor02);
    }
}
