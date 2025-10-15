import java.util.Scanner;
public class Player {
    
        private int keys = 0;
        private boolean alive = true;
        private int health = 3;

        public void increaseHealth() { 
        if (health >= 3){
            System.out.println("You are already max health!");
        }
        else{
        System.out.println("Your current health is: " + health);
        this.health+=1;
        System.out.println("You healed for one health!");
        }
        }
    }


public void setHealth(){
    health = 3;
    System.out.println("Your health starts at " + health ".")
}
  

 public int getHealth() {
    return this.health;
    System.out.println("You have " + health + " health.")
 }
 public void alive(){
        if (health<=0){
            System.out.println("You died with " + this.keys + " keys!");
            alive = false;
        }
        }
    public void giveKey(){
        if (keys < 3){
            keys+=1;
            System.out.println("You now have "+ this.keys + " keys.")
        }
    }

