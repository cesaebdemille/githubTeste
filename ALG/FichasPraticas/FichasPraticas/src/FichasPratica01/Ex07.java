package FichasPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor01, valor02, valor03;
        System.out.println("Indique o preço do primeiro produto: ");
        valor01 = input.nextInt();

        System.out.println("Indique o preço do segundo produto: ");
        valor02 = input.nextInt();

        System.out.println("Indique o preço do terceiro produto: ");
        valor03 = input.nextInt();

        System.out.println((valor01 + valor02 + valor03)*0.9);
    }
}
