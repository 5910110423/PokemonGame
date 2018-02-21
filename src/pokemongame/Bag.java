package pokemongame;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Pokemon> pokemonsBag;
    
	public Bag(){
		pokemonsBag = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemonsBag.add(pokemon);
	}  
}
