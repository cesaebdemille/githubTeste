package FichaPratica05;

import java.util.Scanner;

public class F05Ex08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

//        permita adicionar 9 números inteiros (ler input do utilizador)
//        a uma matriz 3x3
//        e que os imprima com o seguinte aspeto gráfico


        int[][] matriz = new int[3][3];

        //Leitura da matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print("insira na matriz [" + linha +  "] ["+coluna+"] : " );
                matriz[linha][coluna] = input.nextInt();
            }
        }

        //impressao da matriz
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }
}
