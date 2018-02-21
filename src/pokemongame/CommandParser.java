package pokemongame;

/**
 *
 * @author NICK
 */
import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
        private Forrest forrest = new Forrest();
	private Scanner commandScanner;
	private boolean isRunning;

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
                        else if(command.equals("exercise"))
                                this.exercisePokemons();
                        else if(command.equals("remove"))
                                this.removePokemon();
                        else if(command.equals("find"))
                                this.catchPokemon();
		}

	}

	private void addPokemon(){
		//commandScanner.nextLine();
		// input name weight length
                System.out.print("Pokemon :");
		String pokemonType = commandScanner.next();
                System.out.print("name :");
		String name = commandScanner.next();
                System.out.print("weight :");
		float weight = commandScanner.nextFloat();
                System.out.print("step length :");
		float stepLength = commandScanner.nextFloat();

            switch(pokemonType){
                case "Eevee":
                    Eevee eevee = new Eevee(name, weight, stepLength);
                    pokemonFarm.addPokemon(eevee);
                    break;
                case "Snorlax":
                    Snorlax Snor = new Snorlax(name, weight, stepLength);
                    pokemonFarm.addPokemon(Snor);
                    break;
                case "Bulbasaul": 
                    Bulbasaul bul = new Bulbasaul(name, weight, stepLength);
                    pokemonFarm.addPokemon(bul);
                    break;
                default:
                    break;
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
		} else {
                    this.pokemonFarm.feed(name);
                }
	} 
        
        private void removePokemon(){
            System.out.print("what index do you want to remove");
            int indedx = commandScanner.nextInt();
        }
        
        private void exercisePokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.exercise("all");
		} else {
                    this.pokemonFarm.exercise(name);
                }
	} 
        
        private void catchPokemon(){
            
            //Forrest forrest = new Forrest();
            int i=1;
            while(i==1){
                
                System.out.print("What do you want? find or quit: ");
                String ans= this.commandScanner.next();
                if(ans.equals("find")){
                    this.forrest.find();
                }
                else if(ans.equals("quit")){
                    i=0;
                }
            }
            
        }
}


