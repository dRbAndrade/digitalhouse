package main.java.aula1018.assincrona.facade;

import javax.swing.*;

public class ATMService implements ATMFacade{


    @Override
    public void withdraw(Integer id, String password, Double value) {
        if(!AuthenticationService.validateUserAndPassword(id,password))return;
        Account acc = AccountService.getAccount(id);
        String msg;
        String title;
        int type;
        if(acc.withdraw(value)){
            msg = String.format("""
                    Saque realizado com sucesso.
                    Saldo atual: %.2f""",acc.getBalance());
            type = JOptionPane.INFORMATION_MESSAGE;
            title = "Operação realizada";
        }else{
            msg = String.format("""
                    Saldo insuficiente
                    Saldo atual: %.2f""",acc.getBalance());
            type = JOptionPane.ERROR_MESSAGE;
            title = "Operação não -realizada!";
        }
        JOptionPane.showMessageDialog(
                null,
                msg,
                title,
                type);

    }

    private static void exit(){
        JOptionPane.showMessageDialog(null, """
                Muito obrigado por usar o Caixa dRb!
                Até logo o/""");
        System.exit(0);
    }
    public static void main(String[] args) {

        AccountService.generateAndSaveAccount();
        while(true) {
            String msg = """
                    Digite -1 para sair a qualquer momento.
                    A seguir, digite um por um, seu ID, Senha e Valor a retirar.
                                    p.s: Não tem validação de tipo, pega leve
                    %s:""";
            String id = JOptionPane.showInputDialog(null, String.format(msg, "ID"));
            if(id.equals("-1"))exit();
            String password = JOptionPane.showInputDialog(null, String.format(msg, "Senha"));
            if(password.equals("-1"))exit();
            String value = JOptionPane.showInputDialog(null, String.format(msg, "Valor"));
            if(value.equals("-1"))exit();
            new ATMService().withdraw(
                    Integer.parseInt(id),
                    password,
                    Double.parseDouble(value));

        }

    }
}
