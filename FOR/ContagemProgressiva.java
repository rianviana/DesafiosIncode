package Atividades.Atividades.Semana03.FOR;

import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("informe um numero: ");
        int num = entrada.nextInt();
        System.out.println("----------------CONTAGEM PROGRESSIVA-----------------\n");
        for (int i = 1; i <= num ; i++) {

            System.out.println(i);

        }
    }
}
