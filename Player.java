import java.util.Scanner;
public class Player {
    
        private int keys;
        private boolean alive;
        private int health;
        private String name;
        private String[] inventory;
        private int arrows;

        public void Player(String name){
            this.keys = 0;
            this.alive = true;
            this.health = 3;
            this.name = name;
            this.inventory = ["sword, sheild, crossbow"];
            this.arrows = 2;
        }

        public void increaseHealth(){ 
            if (health >= 3){
                System.out.println("You are already max health!");
            }
            
            else{
            this.health+=1;
            System.out.println("Your health is now: " + this.health);
            }
        }

        public void decreaseHealth(){     
            this.health-=1;
        }
        
        public int getHealth() {
            return this.health;
        }

        public boolean alive(){
            return this.alive        
        }

        public int keys(){
            return this.keys;
        }

        public int arrows(){
            return this.arrows;
        }

        public void check_death(){
            if (health<=0){
                this.alive = false;
            }
        }

        public void giveKey(){
            if (keys < 3){
                keys+=1;
                System.out.println("You now have "+ this.keys + " keys.")
            }
        }

    }