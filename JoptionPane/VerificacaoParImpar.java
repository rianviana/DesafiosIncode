package Atividades.Atividades.Semana03.JoptionPane;

import javax.swing.*;

public class VerificacaoParImpar {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

         if (n1  %2 ==0){
             JOptionPane.showMessageDialog(null, "O numero é par", "informarcao",JOptionPane.INFORMATION_MESSAGE);
         }
         else {
             JOptionPane.showMessageDialog(null, "O numero é impar", "informacao", JOptionPane.INFORMATION_MESSAGE);
         }
    }
}
