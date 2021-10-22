package aula0811;

import javax.swing.*;
import java.net.URL;

public class Dividir {

    public static void main(String[] args) {

        int n1=0;
        int n2=0;
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro"));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(
                    null,
                    "Não é um número inteiro.",
                    "Erro!",JOptionPane.ERROR_MESSAGE
            );
            System.exit(1);
        }
        double div = (double)n1/n2;
        String msg;
        ImageIcon icon;
        URL url;
        if(n1%n2==0){
            msg = "O número %d é divisível pelo número %d.\nO resultado é: %f";
            url = Dividir.class.getResource("Flat_tick_icon.svg.png");
        }else{
            msg = "O número %d não é divisível pelo número %d.\nO resultado é: %f";
            url = Dividir.class.getResource("wrong-icon-8.png");
        }
        assert url != null;
        icon = new ImageIcon(url);
        JOptionPane.showMessageDialog(
                null,
                String.format(msg,n1,n2,div),
                "Resultado",
                JOptionPane.PLAIN_MESSAGE, icon
        );

    }

}