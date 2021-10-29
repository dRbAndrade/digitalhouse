package aula1028;

public class Animals {

    public enum Type{
        DOG,
        CAT,
        ETC
    }

    private int id;
    private String name;
    private Type type;

    public Animals(String name, Type type) {
        this.name = name;
        this.type = type;
    }

}
