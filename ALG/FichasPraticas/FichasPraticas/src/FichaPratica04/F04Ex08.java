package FichaPratica04;

import java.util.Scanner;

public class F04Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ifs so aceitam boolean trues
        // se um número (passado por argumento) é triangular,
        // a função deve retornar true se triangular ou false se não triangular
        //Um número triangular é um número que pode ser
        //representado pela soma de números inteiros consecutivos.
        // Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5


        //declarar
        int numero, triangulares = 0;
        boolean numeroTriangular = false;

        System.out.println("insira um  numero: ");
        numero = input.nextInt();

        for(int i=1; triangulares < numero; i++ ){
            triangulares += i ;

            if (triangulares == numero) {

                numeroTriangular = true;
            }
        }

        //ifs so aceitam boolean trues
        if(numeroTriangular){
            System.out.println("triangular");
        } else {
            System.out.println("não triangular");
        }

    }
}
