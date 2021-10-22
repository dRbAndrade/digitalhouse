package main.java.aula1021.sincrona.mesadetrabalho;

public class User {

    private String name;
    private String id;
    private String userType;

    public User(String name, String id, String userType) {
        this.name = name;
        this.id = id;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
