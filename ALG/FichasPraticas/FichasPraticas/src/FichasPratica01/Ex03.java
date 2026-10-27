package FichasPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //importar
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int largura, altura, area, perimetro;

        //solicitar ao utilizador
        System.out.print("insira a largura do rectangulo em cm: ");
        largura = input.nextInt();

        System.out.print("insira a altura do rectangulo em cm: ");
        altura = input.nextInt();

        //calculos
        area = largura * altura;
        perimetro = 2 * largura + 2 * altura;

        // display
        System.out.println("A àrea é: " + area + "O perímetro é: " + perimetro);

    }
}
