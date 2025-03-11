package Atividades.Atividades.Semana03.SwicthBreakContinue;

import java.util.Scanner;

public class EscolhaComida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String op = "";

        do {

            System.out.println("\n-------------MENUFOOD-----------");
            System.out.println("1. Pizza");
            System.out.println("2. Hamburguer");
            System.out.println("3. Sushi");
            System.out.println("4. Churrasco");
            System.out.println("5. Cachorro Quente");
            System.out.println("6. Bolo");
            System.out.println("Escolha uma opção: ");

            op = entrada.nextLine().trim();

            switch (op){

                case "1":{
                    System.out.println("VOCE ESCOLHEU: PIZZA");
                }
                break;
                case "2":{
                    System.out.println("VOCE ESCOLHEU: HAMBURGUER");
                }
                break;
                case "3":{
                    System.out.println("VOCE ESCOLHEU: SUSHI");
                }
                break;
                case "4":{
                    System.out.println("VOCE ESCOLHEU: CHURRASCO");
                }
                break;
                case "5":{
                    System.out.println("VOCE ESCOLHEU: CACHORRO QUENTE");
                }
                break;
                case "6":{
                    System.out.println("VOCE ESCOLHEU: BOLO");
                }
                break;

                default:
                System.out.println("OPCAO INVALIDA DIGITE NOVAMENTE");
                continue;
            }
        }while (!op.equals("1") && !op.equals("2") && !op.equals("3") &&!op.equals("4") &&!op.equals("5") &&!op.equals("6"));


        entrada.close();
    }
}
