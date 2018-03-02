/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokemongames;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Core I7
 */
public class Forrest {
    private Bag bag;
    Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);
    public void find(){
        
            
            String name[] = {"Eevee","Snorlax","Pikaju"};
            String type = name[rand.nextInt(3)];
            System.out.println("Pokemon" + type);
            catchPokemon(type);
            
            
    }
public void catchPokemon(String type){
       int mood = rand.nextInt(10)+1;
       int ball = select();
       int result;
       if(ball == 1){result = mood*8;}
       else if(ball == 2){result = mood*9;}
       else {result = mood*10;}
       
       if(result >=50){
           System.out.println("Success");
           bag = new Bag();
           addPokemon(type);
           
       }
       else {
           System.out.println("Fail");
           
       }
    
}
public int select(){
            System.out.println("Type of poke ball 1=PokeBall / 2=GreatBall / 3=UltraBall");
            int ball = scanner.nextInt();
            return ball;
}
private void addPokemon(String type){
		scanner.nextLine();
		// input name weight length
		
                System.out.print("Name: ");
		String name = scanner.next();
                System.out.print("Weight: ");
		float weight = scanner.nextFloat();
                System.out.print("StepLength: ");
		float stepLength = scanner.nextFloat();
                
		if(type.equals("Eevee")){
			Eevee eevee = new Eevee(name, weight, stepLength);
			bag.addPokemon(eevee);
		}
                else if(type.equals("Snorlax")){
			Snorlax snorlax = new Snorlax(name, weight, stepLength);
			bag.addPokemon(snorlax);
                }   
                else if(type.equals("Pikaju")){
			Pikaju pikaju = new Pikaju(name, weight, stepLength);
			bag.addPokemon(pikaju);
                }

	}
    
}
