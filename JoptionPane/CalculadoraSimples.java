package Atividades.Atividades.Semana03.JoptionPane;

import javax.swing.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("informe um numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("informe um numero: "));

        String op;
        int resultado = 0;

while (true ) {
    op = JOptionPane.showInputDialog("Escolha o sinal para operacoa que deseja realizar \" + \"  \" - \" \" * \" \" / \", ");

    if (op.equals("+")) {
        resultado = n1 + n2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Soma", JOptionPane.PLAIN_MESSAGE);
        break;
    } else if (op.equals("-")) {
        resultado = n1 - n2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Subtracao", JOptionPane.PLAIN_MESSAGE);
        break;
    } else if (op.equals("*")) {
        resultado = n1 * n2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Multiplicação", JOptionPane.PLAIN_MESSAGE);
        break;
    } else if (op.equals("/")) {
        resultado = n1 / n2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Divisão", JOptionPane.PLAIN_MESSAGE);
        break;
    } else {
        JOptionPane.showMessageDialog(null, "digite uma operacao valida", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    }
        }
