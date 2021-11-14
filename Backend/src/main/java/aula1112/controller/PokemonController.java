package aula1112.controller;

import aula1112.model.Pokemon;
import aula1112.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pokemon")

public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public Map<Integer, Pokemon> getPokemons(){
        return service.listPokemons();
    }

    @PostMapping
    public Pokemon addPokemon(@RequestBody Pokemon pokemon){
        return service.createPokemon(pokemon);
    }

    @PutMapping
    public Pokemon editPokemon(@RequestBody Pokemon pokemon){
        return service.editPokemon(pokemon);
    }

    @DeleteMapping
    public Pokemon deletePokemon(@RequestBody Pokemon pokemon){
        return service.deletePokemon(pokemon);
    }

}
