package main.java.aula1019;

import main.java.util.Generator;

public class Affiliate extends Salesperson{

    public Affiliate(String name) {
        super(name);
    }

    @Override
    protected void calculateScore() {
        setScore(getSales()*15);
    }

    public static Affiliate generateRandomAffiliate(){
        return new Affiliate(Generator.generateRandomGibberish(6));
    }

    @Override
    public String toString() {
        return String.format("""
                Vendedor: %s
                Tipo: Afiliado""",
                getName());
    }
}
