package FichaPratica04;

import java.util.Scanner;

public class F04Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //solicite um número ao utilizador,
        // seguidamente, apresente todos os seus divisores
        // (inicialização, condição, iteração)

        int num01, num02, aux;


        System.out.print("introduza um numero: ");
        num01 = input.nextInt();

        //o num01 tem que ser introduzido
        //num02 menor que num01
        //o num02 tem q ++
        //o num01%num02 = resultado
        //o resultado tem que ser avaliado
        //nao breakar POR encontar FALSE ... ignorar FALSE
        //recomecar sempre que true

        for (num02=1; num02<=num01; num02++) {
            if (num01 % num02 == 0) {
                System.out.println(num02);
            }
        }
    }
}
