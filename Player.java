import java.util.Scanner;
public class Player {
    
    public static void main(String[] args) {
        int keys = 0;
        boolean alive = true;
        int currentHealth = 3;
        public static increaseHealth(this.currentHealth){
        if (currentHealth >= 3){
            System.out.println("You are already max health!")
        }
        else{
        System.out.println("Your current health is: " + currentHealth);
        currentHealth+=1;
        System.out.println("You healed for one health!")
        return currentHealth;
        }
        }
    }
    public static alive(this.currentHealth){
        if (currentHealth<=0){
            System.out.println("You died with " + player.keys + " keys!")
            alive = false;
            return dead;
        }
        }
    public static void giveKey()
}