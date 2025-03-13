package Atividades.Atividades.Semana03.JoptionPane;

import javax.swing.*;

public class CalcularMedia {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("informe a  1º nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("informe a  2º nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("informe a  3º nota: "));

        double soma = nota1 + nota2 + nota3;
        double media = soma/3;

        JOptionPane.showMessageDialog(null, "A media é: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
