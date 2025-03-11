package Atividades.Atividades.Semana03.FOR;

import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("informe um numero: ");
        int num = entrada.nextInt();

        int soma = 0;

        int total = 0;


        for (int i = 1; i <= num ; i++) {
            soma += i;
        }
        total = soma;
        System.out.println("A soma de todos os numeros é: " + total);

        entrada.close();
    }
}
