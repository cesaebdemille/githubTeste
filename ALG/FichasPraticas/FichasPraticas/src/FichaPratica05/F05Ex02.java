package FichaPratica05;

import java.util.Scanner;

public class F05Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //permita adicionar comissões mensais a um array de tamanho 12
        // (uma posição para cada mês)
        // e calcular o seu total anual.

        //Sintaxe: tipo_dados[] nome_vetor = new tipo_dados[nº de elementos];

        //declarar vars e array
        double[] comissoes = new double[12];
        double soma=0;

        for (int i = 0; i<12; i++){
            //cases para "janeiro, fevereiro, etc?
            System.out.print("insira comissao:["+ i+ "] :");
            comissoes[i] = input.nextInt();
            soma+=comissoes[i];
        }
        System.out.println(soma);




    }
}
