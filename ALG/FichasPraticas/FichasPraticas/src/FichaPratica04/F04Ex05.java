package FichaPratica04;

import java.util.Scanner;

public class F04Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
//         escolhida, deverá apresentar um texto com a opção escolhida.
//         Caso a escolhaesteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
//         para poder selecionar novas opções até que a opção 4 seja escolhida.
        //dowhile + nested switch

        int escolha;

        do{
            System.out.println("\n-----Menu-----");
            System.out.println("Criar-----1");
            System.out.println("Atualizar-2");
            System.out.println("Eliminar--3");
            System.out.println("Sair------0");

            System.out.print("escolha: ");
            escolha = input.nextInt();

            switch(escolha){

                    case 1:
                        System.out.println("Criar!");
                    break;

                    case 2:
                        System.out.println("Atualizar!");
                    break;

                    case 3:
                        System.out.println("Eliminar!");
                    break;

                    case 0:
                        System.out.println("Sair!");
                    break;
                default:
                    System.out.println("scolha invalida");
                    break;
            }
        }while (escolha !=0);{
            System.out.println(escolha);
        }

    }
}
