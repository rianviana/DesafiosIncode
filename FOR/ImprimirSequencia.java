package Atividades.Atividades.Semana03.FOR;

import java.util.Scanner;

public class ImprimirSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("informe um numero: ");
        int n = entrada.nextInt();

        for (int i = 0 ; i < n; i++) {

            System.out.print((2 *  i ));

        }



        entrada.close();
    }
}
