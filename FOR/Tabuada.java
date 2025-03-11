package Atividades.Atividades.Semana03.FOR;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("informe um numero: ");
        int num = entrada.nextInt();
        int tabuada = 0;
        for (int i = 1; i <= num ; i++) {

            tabuada = num * i;

            System.out.println("O numero " + num + "X" + i + " é: " + tabuada);

        }


        entrada.close();
    }
}
