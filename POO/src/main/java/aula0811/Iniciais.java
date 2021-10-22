package aula0811;

import javax.swing.*;
import java.util.Locale;

public class Iniciais {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Insira seu primeiro nome");
        String sobrenome = JOptionPane.showInputDialog("Insira seu sobrenome");
        String msg = String.format(
                "Suas iniciais são: %s.%s.",
                nome.substring(0,1).toUpperCase(),
                sobrenome.substring(0,1).toUpperCase()
        );
        JOptionPane.showMessageDialog(
                null, msg,
                "Iniciais",JOptionPane.INFORMATION_MESSAGE
        );

    }


}
