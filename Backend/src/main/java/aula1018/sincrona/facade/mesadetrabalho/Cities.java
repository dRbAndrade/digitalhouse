package main.java.aula1018.sincrona.facade.mesadetrabalho;

public enum Cities {

    FERNANDO_DE_NORONHA("Fernando de Noronha"),
    PARIS("Paris"),
    TORONTO("Toronto"),
    RIO_DE_JANEIRO("Rio de Janeiro"),
    TALLAHASSEE("Tallahassee"),
    MADRID("Madrid"),
    ESTOCOLMO("Esocolmo"),
    BERNA("Berna"),
    ROMA("Roma"),
    MOSCOU("Moscou");

    private String name;

    Cities(String name){
        this.name = name;
    }
    public static Cities randomCity(){

        int seed = (int)(Math.random()*10);
        switch (seed){
            case 2 -> {return PARIS;}
            case 3 -> {return TORONTO;}
            case 4 -> {return RIO_DE_JANEIRO;}
            case 5 -> {return TALLAHASSEE;}
            case 6 -> {return MADRID;}
            case 7 -> {return ESTOCOLMO;}
            case 8 -> {return BERNA;}
            case 9 -> {return ROMA;}
            case 10 -> {return MOSCOU;}
            default -> {return FERNANDO_DE_NORONHA;}
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
