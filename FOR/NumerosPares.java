package Atividades.Atividades.Semana03.FOR;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("infrome um numero: ");
        int n = entrada.nextInt();

        int par = 0;
        System.out.print("Todos os numeros pares: ");

        for (int i = 0; i < n; i++) {
            par = 2 * i;
            System.out.print( par + " ");

        }

        entrada.close();
    }
}
