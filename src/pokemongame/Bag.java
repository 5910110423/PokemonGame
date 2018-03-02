/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongames;

import java.util.ArrayList;

/**
 *
 * @author Core I7
 */
public class Bag {
    private PokemonFarm farm;
     private ArrayList<Pokemon> pokemonBag;
     private Pokemon pokemon = new Pokemon();
	public Bag(){
		pokemonBag = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemonBag.add(pokemon);
	}
       
        public void addToFarm(){
            this.farm = new PokemonFarm();
            System.out.print("5555555555555");
		for(Pokemon pokemon: pokemonBag){
                     System.out.print("555555...............5555555");
				farm.addPokemon(pokemon);
			}
	}
	

	
    
}
