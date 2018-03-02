/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongames;

import java.util.Scanner;

/**
 *
 * @author Core I7
 */
public class CommandParser {
        private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
        private Forrest forrest = new Forrest();
        private Bag bag;
        

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if (command.equals("remove"))
                                this.removePokemon();
                        else if(command.equals("walk"))
                                this.walkPokemons();
                        else if(command.equals("exercise"))
				this.exercisePokemons();
                        else if(command.equals("catch"))
				this.CatchPokemon();
                        
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
		System.out.print("PokemonType: ");
		String pokemonType = commandScanner.next();
                System.out.print("Name: ");
		String name = commandScanner.next();
                System.out.print("Weight: ");
		float weight = commandScanner.nextFloat();
                System.out.print("StepLength: ");
		float stepLength = commandScanner.nextFloat();
                
		if(pokemonType.equals("Eevee")){
			Eevee eevee = new Eevee(name, weight, stepLength);
			pokemonFarm.addPokemon(eevee);
		}
                else if(pokemonType.equals("Snorlax")){
			Snorlax snorlax = new Snorlax(name, weight, stepLength);
			pokemonFarm.addPokemon(snorlax);
                }   
                else if(pokemonType.equals("Pikaju")){
			Pikaju pikaju = new Pikaju(name, weight, stepLength);
			pokemonFarm.addPokemon(pikaju);
                }

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
                else{
                        this.pokemonFarm.feed(name);
                }
                
	}
        private void walkPokemons(){
            
                
                System.out.print("Which pokemon do you want to walk? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.walk("all");
		}
                else{
                        this.pokemonFarm.walk(name);
                }
        }
        private void removePokemon(){
                System.out.print("index : ");
                int index = commandScanner.nextInt();
                pokemonFarm.removePokemon(index);
        } 
        private void exercisePokemons(){
            System.out.print("Which pokemon do you want to exercise? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.exercise("all");
		}
                else{
                        this.pokemonFarm.exercise(name);
                }
        }
        private void CatchPokemon(){
                int i=1;
                while(i==1){
                System.out.print("Which do you want? (catch  or quit) ) ");
                String want = this.commandScanner.next();
                    if(want.equals("catch")){
			
                        this.forrest.find();
                    }
                    else if(want.equals("quit")){
                        this.bag = new Bag();
                        bag.addToFarm();
                        
                        
                        i = 0;
                    }
                }
                
        } 
        

}
