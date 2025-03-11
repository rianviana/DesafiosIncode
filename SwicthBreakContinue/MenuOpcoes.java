package Atividades.Atividades.Semana03.SwicthBreakContinue;

import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------MENU----------------");
        System.out.println("1. Acao 1");
        System.out.println("2. Acao 2");
        System.out.println("3. Acao 3");
        System.out.println("Digite \"SAIR\" para encerrar: \n");

        String opcoes = entrada.nextLine().trim();

        switch (opcoes.toLowerCase()){

            case "1": {
              System.out.println("VOCE ESCOLHEU A ACAO 1");
          }
          break;

            case "2": {
                System.out.println("VOCE ESCOLHEU A ACAO 2");
            }
            break;

            case "3": {

                System.out.println("VOCE ESCOLHEU A ACAO 3");
            }
            break;
            
            default:
                System.out.println("OBRIGADO!!");
        }

        entrada.close();
    }
}
