package FichaPratica04;

public class F04Ex02   {
    public static void main(String[] args) {

// imprima os números ímpares de 11 a 51 (inclusive) usando o ciclo for,
// no final, apresente o somatório de todos estes números.

//for ( ! ; ? ; !)

        int num1, num2=51, soma=0;

        for(num1=11; num1<=num2; num1+=2 ) {
            System.out.println(num1);
            soma += num1;
        }

        System.out.println("soma2 "+ soma);


    }
}
