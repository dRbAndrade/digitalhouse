package aula1112.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {

    private int id;
    private String name;
    private String type;
    private Integer pokedex;
    private String[] moveset;

    public Pokemon(int id, String name, String type, Integer pokedex, String[] moveset) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pokedex = pokedex;
        this.moveset = moveset;
    }

}
