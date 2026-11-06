package FichaPratica05;

import java.util.Scanner;

public class F05Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        adicionar 10 números inteiros a um array e que os imprima pela ordem
//        de inserção. Exemplo de execução:

        //declarar variaveis
        int[] vetor = new int[10];

        //leitura
        //member access operator "."
        //what comes after is a member of whats on the left
        // FIELD OR attribute or property --> no "( )"
        // METHOD: an (ACTION)

        for (int i = 0; i<vetor.length; i++){
            System.out.println("insira no vetor["+ i+ "]");
            vetor[i] = input.nextInt();
        }

        System.out.println("----------------------------------");
        for(int i = 0; i< vetor.length; i++){
            System.out.println("Vetor[" + i + "]" + vetor[i]);
        }


    }
}
