package FichaPratica04;

import java.util.Scanner;

public class F04Ex07_V2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// se um número pedido ao utilizador é primo. (Chamamos de número primo um
//número natural que só possui dois divisores: 1 e ele mesmo)

        int num01, div, count=0;

        System.out.println("insira um numero: ");
        num01= input.nextInt();

        for(div=1; div<=num01 && count < 3; div++){
            if (num01%div == 0){
            count++;}
        }

        
        System.out.println(count);
        if (count==2){
            System.out.println("prime"); 
        } else System.out.println("not prime"); 
        
         




    }
}
