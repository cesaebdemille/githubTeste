package FichasPratica01;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIAVEIS
        final double PI= 3.14159265358;
        double raio;
        double area;

        //ler valores
        System.out.print("Insira o raio da circunferencia em cm: ");
        raio = input.nextDouble();

        //Calculo e Present
        area = PI * raio * raio;
        System.out.println("A area do círculo de raio " + raio + "é " + area);

    }
}
