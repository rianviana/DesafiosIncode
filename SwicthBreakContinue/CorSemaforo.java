package Atividades.Atividades.Semana03.SwicthBreakContinue;

import java.util.Scanner;

public class CorSemaforo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escolha um numero correspondente ao sinal de um semaforo que voce deseja (1 = vermelho, 2 = amarelo, 3 = verde): ");
        int num = entrada.nextInt();


                switch (num) {
                    case 1:
                        System.out.println("Vermelho");
                        break;
                    case 2:
                        System.out.println("Amarelo");
                        break;
                    case 3:
                        System.out.println("Verde");
                        break;
                    default:
                        System.out.println("Opao invalida, digite uma opcao valida!!! ");


                }
        entrada.close();
    }
}
