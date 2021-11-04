package aula1019;

import util.Generator;

public class Intern extends Salesperson{
    public Intern(String name) {
        super(name);
    }

    @Override
    protected void calculateScore() {
        setScore(getSales()*5);
    }

    public static Intern generateRandomIntern(){
        return new Intern(Generator.generateRandomGibberish(6));
    }

    @Override
    public String toString() {
        return String.format("""
                Vendedor: %s
                Tipo: Estagiário""",
                getName());
    }
}
