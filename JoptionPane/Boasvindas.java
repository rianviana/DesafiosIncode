package Atividades.Atividades.Semana03.JoptionPane;

import javax.swing.*;

public class Boasvindas {
    public static void main(String[] args) {

      String nome = JOptionPane.showInputDialog("Qual é o seu nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem-vindo " + nome + "!", "OLÁ", JOptionPane.PLAIN_MESSAGE);

    }
}
