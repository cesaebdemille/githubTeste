package FichaPratica02;

import java.util.Objects;
import java.util.Scanner;

public class F02Ex11_V02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar vars

        double saldo, valor, saldoFinal;
        String operacao;


        //pedir ao utilizador o saldo da conta bancária SALDO
        System.out.print("introduza seu saldo corrente: ");
        saldo = input.nextDouble();

        //  creditar/debitar? (montante positivo ou negativo, respetivamente) OPERACAO
        System.out.print("Escolha [+] crédito ou [-] para débito: ");
        operacao = input.next();

        //inserir valor
        System.out.print("introduza o valor a transitar: ");
        valor = input.nextDouble();

        //Tipo Operação
        switch (operacao){
            case "+":
                break;

            case "-":
                valor = valor *-1;
                break;
            default:
                System.out.println("não escolheu operação");
                break;
        }


        //operação é válida ==  saldo final positivo SALDOFINAL

        if((saldo + valor) >= 0){
            saldoFinal = saldo + valor;
            System.out.println("Operação válida. O seu Saldo previsto é: " + saldoFinal);
        } else {
            System.out.println("Operação inválida. O seu Saldo previsto seria negativo");
        }

//Finalmente, mostre o novo saldo


    }
}
