package main.java.aula1019;

public enum Rank {
    NOVICE("Novato"),
    APPRENTICE("Aprendiz"),
    EXPERIENCED("Experiente"),
    MASTER("Mestre");

    private String rank;

    Rank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank;
    }
}
