import java.util.Scanner;
public class Player {
    
    public static void main(String[] args) {
        int keys = 0;
        boolean alive = true;
        int health = 3;
        public static increaseHealth(this.health){
        if (health >= 3){
            System.out.println("You are already max health!")
        }
        else{
        System.out.println("Your current health is: " + health);
        health+=1;
        System.out.println("You healed for one health!")
        return health;
        }
        }
    }
    public static alive(this.health){
        if (health<=0){
            System.out.println("You died with " + player.keys + " keys!")
            alive = false;
            return alive;
        }
        }
    public static giveKey(this.keys){
        if (keys <3){
            keys+=1;
            System.out.println("You now have "+ keys + " keys.")
        }
    }

}