package aula0812.jokenpo;

import java.util.Objects;

public class Options {

    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;
    public static final int LIZARD = 3;
    public static final int SPOCK = 4;

    private final int choice;
    private final int[] beats;
    private final int[] beatenBy;

    public Options(){
        choice=-1;
        beats=null;
        beatenBy=null;
    }

    public Options(int choice){
        this.choice = choice;
        switch(choice){
            case 0 -> {beats=new int[]{2,3};beatenBy=new int[]{1,4};}
            case 1 -> {beats=new int[]{0,4};beatenBy=new int[]{2,3};}
            case 2 -> {beats=new int[]{1,3};beatenBy=new int[]{0,4};}
            case 3 -> {beats=new int[]{1,4};beatenBy=new int[]{0,2};}
            case 4 -> {beats=new int[]{0,2};beatenBy=new int[]{1,3};}
            default -> {beats=null;beatenBy=null;}
        }
    }

    public boolean beats(Options choice){

        for (int b : Objects.requireNonNull(beats)) {
            if(b==choice.choice)return true;
        }

        return false;
    }

    public boolean isBeatenBy(Options choice){
        for (int b : Objects.requireNonNull(beatenBy)) {
            if(b==choice.choice)return true;
        }

        return false;

    }

    @Override
    public String toString() {
        String opt = "";
        switch (choice){
            case 0 -> opt="Pedra";
            case 1 -> opt="Papel";
            case 2 -> opt="Tesoura";
            case 3 -> opt="Lagarto";
            case 4 -> opt="Spock";
        }
        return opt;
    }
}
