package FichasPratica01;

import java.util.Scanner;

public class Ex08_corr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutosLidos, segundosLidos, TotalSegundosAlbum = 0;

        //ler dur musicas

        //Album 1
        System.out.print("insira minutos de 1: ");
        minutosLidos = input.nextInt();

        System.out.print("insira segundos de 1: ");
        segundosLidos = input.nextInt();

        TotalSegundosAlbum = TotalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        //Album 2
        System.out.print("insira minutos de 2: ");
        minutosLidos = input.nextInt();

        System.out.print("insira segundos de 2: ");
        segundosLidos = input.nextInt();

        TotalSegundosAlbum = TotalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        //Album 3
        System.out.print("insira minutos de 3: ");
        minutosLidos = input.nextInt();

        System.out.print("insira segundos de 3: ");
        segundosLidos = input.nextInt();

        TotalSegundosAlbum = TotalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        //Album 4
        System.out.print("insira minutos de 4: ");
        minutosLidos = input.nextInt();

        System.out.print("insira segundos de 4: ");
        segundosLidos = input.nextInt();

        TotalSegundosAlbum = TotalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        //Album 5
        System.out.print("insira minutos de 5: ");
        minutosLidos = input.nextInt();

        System.out.print("insira segundos de 5: ");
        segundosLidos = input.nextInt();

        TotalSegundosAlbum = TotalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        //conversao
        int horas, minutos, segundos;

        horas = TotalSegundosAlbum / 3600;
        TotalSegundosAlbum = TotalSegundosAlbum % 3600;
        minutos = TotalSegundosAlbum / 60;

        segundos = TotalSegundosAlbum;

        System.out.print( horas);
    }
}
