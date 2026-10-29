package FichaPratica03;

public class F03Ex03 {
    public static void main(String[] args) {

        //Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive.

        int i = 0;

        while (i <= 750) {
            if (i>531 && i% 2 == 0) {
                ;
            } else if (i>531 && i% 2 != 0) {
                System.out.println(i);
                ;
            }
            i++;
        }
    }
}