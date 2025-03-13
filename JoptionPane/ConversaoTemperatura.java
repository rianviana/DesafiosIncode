package Atividades.Atividades.Semana03.JoptionPane;

import javax.swing.*;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("digite uma temperatura em Celsius: ");
        double celsius = Double.parseDouble(entrada);

        double fahrenheit = (celsius * 9/5 ) + 32;

        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahrenheit,"Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
