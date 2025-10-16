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
            this.health+=1;
            System.out.println("Your health is now: " + this.health);
            }
        }

        public void decreaseHealth() {     
            this.health-=1;
        }
        
        public int getHealth() {
            return this.health;
        }

        public boolean alive(){
            return this.alive        
        }

        public void check_death(){
            if (health<=0){
                alive = false;
            }
        }

        public void giveKey(){
            if (keys < 3){
                keys+=1;
                System.out.println("You now have "+ this.keys + " keys.")
            }
        }
        
    }