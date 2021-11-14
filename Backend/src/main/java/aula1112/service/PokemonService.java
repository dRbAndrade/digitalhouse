package aula1112.service;

import aula1112.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PokemonService {

    private static Map<Integer, Pokemon> flyweight = new HashMap<>();

    public Map<Integer, Pokemon> listPokemons(){
        return flyweight;
    }

    public Pokemon createPokemon(Pokemon pokemon){
        pokemon.setId(flyweight.size()+1);
        flyweight.put(pokemon.getId(),pokemon);

        return pokemon;

    }

    public Pokemon editPokemon(Pokemon pokemon){

        Pokemon pokemonToEdit = flyweight.get(pokemon.getId());

        pokemonToEdit.setName(pokemon.getName());
        pokemonToEdit.setPokedex(pokemon.getPokedex());
        pokemonToEdit.setMoveset(pokemon.getMoveset());
        pokemonToEdit.setType(pokemon.getType());

        flyweight.put(pokemonToEdit.getId(),pokemonToEdit);

        return pokemonToEdit;


    }

    public Pokemon deletePokemon(Pokemon pokemon){

        if (flyweight.containsKey(pokemon.getId())){
            Pokemon deletedPokemon = flyweight.get(pokemon.getId());
            flyweight.remove(pokemon.getId());
            return deletedPokemon;
        }
        else{
            return null;
        }

    }

}
