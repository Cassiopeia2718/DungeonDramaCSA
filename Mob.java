import java.util.Scanner;
import Random;
public class Mob { // create_from_seed(seed) generates a random mob
    String type; //mob type
    String description;
    String[] weak_to = ["sword", "crossbow", "shield"]; //weapons which will kill without taking damage
    HashMap<Integer, String[]> drops = new HashMap<Integer, String[]>(); 
    //When killed a mob will get a number from 0-9 this hash map shows the drop outcome for each number
    drops.put(0, null);
    drops.put(1, null);
    drops.put(2, null);
    drops.put(3, null);
    drops.put(4, null);
    drops.put(5, ["Health Potion"]);
    drops.put(6, ["Health Potion"]);
    drops.put(7, ["Key"]);
    drops.put(8, ["Key"]);
    drops.put(9, ["Key"]);
    int drop_num = floor(10*random(seed));

    public static Mob create_from_seed(String seed) {
        int option = floor(4*new Random(seed));
        switch (option) {
            case 0:
                return new skeleton(seed);
            case 1:
                return new zombie(seed);
            case 2:
                return new slime(seed);
            case 3:
                return new spider(seed);
            case default:
                throw new IllegalStateException();
        }
    }

    public static create(String name, String seed) {
        switch (name) {
            case "skeleton": 
                return new skeleton(seed);
            case "zombie":
                return new zombie(seed);
            case "slime":
                return new slime(seed);
            case "spider":
                return new spider(seed);
            case "minotaur":
                return new minotaur(seed);
            case default:
                throw new IllegalStateException();
            }
    }
  
}

public class skeleton extends Mob {
    type = "skeleton";
    weak_to = ["sword, shield"];

}