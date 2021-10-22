package main.java.aula1018.assincrona.facade;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Account {

    private Integer id;
    private Double balance;
    private String password;

    public String getPassword() {
        return password;
    }

    public static Account generateRandomAccount(){

        Double seed = Math.random();
        Account acc = new Account();
        acc.id = (int) (seed*1000);
        acc.balance = (seed*5000-seed*1000)+1000;
        acc.password = "";
        while(acc.password.length()<16){
            seed = Math.random();
            Integer code = (int) (seed*127-seed*33)+33;
            Character ch = (char) code.intValue();
            acc.password+=ch;
        }

        JOptionPane.showMessageDialog(null, String.format("""
                Sua conta foi criada com sucesso.
                Seu id é: %d
                Sua senha é: %s
                Sua senha foi copiada para a área de transferência""",
                acc.id,acc.password),
                "Conta criada com sucesso",
                JOptionPane.INFORMATION_MESSAGE);

        StringSelection stringSelection = new StringSelection(acc.password);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        return acc;

    }

    public Integer getId() {
        return id;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean withdraw(Double value){
        if(value>balance)return false;
        balance-=value;
        return true;
    }

}
