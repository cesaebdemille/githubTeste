package FichaPratica03;

import java.util.Scanner;

public class F03Ex09sentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, soma = 0, cont=0;

        while (i != -1) {
                System.out.print("insira número (int/pos/neg)");
                i = input.nextInt();
                if(i != -1){
                    soma += i;
                    cont +=1; 
                }else 
                System.out.println(soma/cont);

        }
    }
}