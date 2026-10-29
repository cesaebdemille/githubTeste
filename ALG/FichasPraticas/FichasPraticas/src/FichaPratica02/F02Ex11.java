package FichaPratica02;

import java.util.Scanner;

public class F02Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar vars

        double saldo, operacao, saldoFinal;

        //pedir ao utilizador o saldo da conta bancária SALDO
        System.out.print("introduza seu saldo corrente: ");
        saldo = input.nextDouble();

        // montante a creditar/debitar (montante positivo ou negativo, respetivamente) OPERACAO
        System.out.print("introduza o montante a movimentar; use [-] para débito, e [,] para casas decimais: ");
        operacao = input.nextDouble();


        //operação é válida ==  saldo final positivo SALDOFINAL
        saldoFinal = saldo + operacao;

        if(saldoFinal >= 0){
            System.out.println("Operação válida. O seu Saldo atual é: " + saldoFinal);
        }else System.out.println("Operação inválida. O seu Saldo seria negativo" + "(" + saldoFinal + ")");

//Finalmente, mostre o novo saldo


    }
}
