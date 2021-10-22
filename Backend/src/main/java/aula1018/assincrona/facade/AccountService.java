package main.java.aula1018.assincrona.facade;

import java.util.HashMap;

public class AccountService {

    private static HashMap<Integer,Account> accounts = new HashMap<>();

    public static Account getAccount(Integer id) {
        return accounts.get(id);
    }

    public static void generateAndSaveAccount(){
        Account acc = Account.generateRandomAccount();
        accounts.put(acc.getId(),acc);
    }

}
