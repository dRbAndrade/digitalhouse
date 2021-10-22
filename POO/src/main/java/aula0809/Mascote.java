package aula0809;

public class Mascote {

    private String nome;
    private int idade;
    private int qtdComida;
    private String som;
    public Mascote() {

    }

    public Mascote(String nome, int idade, int qtdComida) {
        this.nome = nome;
        this.idade = idade;
        this.qtdComida = qtdComida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdComida() {
        return qtdComida;
    }

    public void setQtdComida(int qtdComida) {
        this.qtdComida = qtdComida;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void showInfo(){
        System.out.printf(
                "%s é um %s de %d anos%n%s come %d gramas e fala \"%s\"%n",
                nome,getClass().getSimpleName(),
                idade,nome,qtdComida,som
        );
    }

}