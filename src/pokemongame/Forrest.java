package pokemongame;

import java.util.Random; 
import java.util.Scanner;

public class Forrest {
    private Scanner sc = new Scanner(System.in);
    private Bag  Bag;
    Random rand = new Random(); 
    
    public void find(){
        
        String name[] = {"Eevee","Snorlax","Bullbasaul"};
        String type = name[rand.nextInt(3)];
        System.out.println("Pokemon is "+ type);
        
        catchMon(type);
        
        
    }
    
    private void catchMon(String type){
        
        int mood = rand.nextInt(10)+1;
        int ball = selectBall();
        int result = 0;
        if(ball==1){
            result = mood*8;
        }
        else if(ball==2){
            result = mood*9; 
        }
        else if(ball==3){
            result = mood*10; 
        }
        
        if(result >= 50){
            System.out.println("Success");
             Bag Bag = new Bag();
             addPokemon(type);
             
        }else{
            System.out.println("Fail");
        }
        
        
    }
    
    private int selectBall(){
        System.out.println("\nSelect Ball:");
        System.out.println("Type 1 is Pokeball");
        System.out.println("Type 2 is Masterball");
        System.out.println("Type 3 is Ultraball");
        int ball = sc.nextInt();
        return ball;
    }
    
    	private void addPokemon(String type){
                //sc.nextLine();
                System.out.print("name :");
		String name = sc.next();
                System.out.print("weight :");
		float weight = sc.nextFloat();
                System.out.print("step length :");
		float stepLength = sc.nextFloat();
                

            switch(type){
                case "Eevee":
                    Eevee eevee = new Eevee(name, weight, stepLength);
                    Bag.addPokemon(eevee);
                    break;
                case "Snorlax":
                    Snorlax Snor = new Snorlax(name, weight, stepLength);
                    Bag.addPokemon(Snor);
                    break;
                case "Bulbasaul": 
                    Bulbasaul bul = new Bulbasaul(name, weight, stepLength);
                    Bag.addPokemon(bul);
                    break;
                default:
                    break;
            }

	}
    
}
