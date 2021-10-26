package main.java.aula1021.assincrona;

import main.java.util.Generator;

public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static User generateRandomUser(){
        String name = Generator.generateRandomGibberish((int)(Math.random()*7)+3);
        return new User(name, name+"@gmail.com");
    }

}
