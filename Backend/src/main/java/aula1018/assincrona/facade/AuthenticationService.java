package main.java.aula1018.assincrona.facade;

import javax.swing.*;

public class AuthenticationService {

    public static boolean validateUserAndPassword(Integer id, String password){

        Account acc = AccountService.getAccount(id);
        if(acc==null||!acc.getPassword().equals(password)){

            JOptionPane.showMessageDialog(null,
                    "ID ou Senha inválidos.",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }

}
