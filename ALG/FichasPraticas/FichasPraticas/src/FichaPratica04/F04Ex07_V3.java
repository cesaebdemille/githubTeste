package FichaPratica04;

import java.util.Scanner;

public class F04Ex07_V3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// se um número pedido ao utilizador é primo. (Chamamos de número primo um
//número natural que só possui dois divisores: 1 e ele mesmo)

        //BOOLEAN solution: todos os numeros sao primos

        int num01;
        boolean primo=true;

        System.out.println("insira um numero: ");
        num01= input.nextInt();

        for(int div=2; div<num01; div++){
            if (num01%div == 0){
            primo = false;}
        }

        

        if (primo){
            System.out.println("prime"); 
        } else System.out.println("not prime"); 
        
         




    }
}
