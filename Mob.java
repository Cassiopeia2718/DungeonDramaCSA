import java.util.Scanner;
import java.util.Random;
public class Mob { // create(seed) generates a random mob
    String type; //mob type
    String description;
    String[] weak_to = new String[]{"Sword", "Crossbow", "Shield"}; //weapons which will kill without taking damage
    HashMap<Integer, String[]> drops = new HashMap<Integer, String[]>(); 
    //When killed a mob will get a number from 0-9 this hash map shows the drop outcome for each number

    drops.put(0, null);
    drops.put(1, null);
    drops.put(2, null);
    drops.put(3, null);
    drops.put(4, null);
    drops.put(5, {"Health Potion"});
    drops.put(6, {"Health Potion"});
    drops.put(7, {"Key"});
    drops.put(8, {"Key"});
    drops.put(9, {"Key"});
    int drop_num;    

    public static Mob create(Long seed) {
        Random random = new Random(seed);
        int option = random.nextInt(4);
        switch (option) {
            case 0: return new Skeleton(seed);
            case 1: return new Zombie(seed+1);
            case 2: return new Slime(seed+2);
            case 3: return new Spider(seed+3);
            case default: throw new IllegalStateException();
        }
    }

    public static Mob create(String name, Long seed) {
        switch (name) {
            case "Skeleton": return new Skeleton(seed);
            case "Zombie": return new Sombie(seed);
            case "Slime": return new Slime(seed);
            case "Spider": return new Spider(seed);
            case "Minotaur": return new Minotaur(seed);
            case default:
                throw new IllegalStateException();
            }
    }
}

public class Skeleton extends Mob {
    public Skeleton(Long seed) {
        type = "Skeleton";
        weak_to = new String[]{"Sword", "Shield"};
        description = "There stands a gaunt figure, nothing but taters of skin streched over a skeleton, 
                        in his eyes smolder a pale flame, all thats left of an evil soul.
                        He draws a bow from his back, and notches an arrow!";
        drops.put(0, new String[]{"arrow"});
        drops.put(1, new String[]{"arrow"});
        drops.put(2, new String[]{"arrow"});
        drops.put(3, new String[]{"arrow"});
        drops.put(4, new String[]{"arrow"});
        drops.put(5, new String[]{"Health Potion", "arrow"});
        drops.put(6, new String[]{"Health Potion", "arrow"});
        drops.put(7, new String[]{"Key"});
        drops.put(8, new String[]{"Key"});
        drops.put(9, new String[]{"Key"});
        Random random = new Random(seed);
        drop_num = random.nextInt(10)
    }
    
}

public class Zombie extends Mob {
    public Zombie(Long seed) {
        type = "Zombie";
        weak_to = new String[]{"Sword", "Crossbow"};
        description = "A pile of rags, rises in front of you revealing a rotting corpse
                        It stumbles toward you, following its vile stench!";
        drops.put(0, null);
        drops.put(1, null);
        drops.put(2, null);
        drops.put(3, null);
        drops.put(4, new String[]{"Health Potion"});
        drops.put(5, new String[]{"Health Potion"});
        drops.put(6, new String[]{"Health Potion"});
        drops.put(7, new String[]{"Key"});
        drops.put(8, new String[]{"Key"});
        drops.put(9, new String[]{"Key"});
        Random random = new Random(seed);
        drop_num = random.nextInt(10)

    }
    
}

public class Slime extends Mob {
    public Slime(Long seed){
        type = "Slime";
        weak_to = new String[]{"Crossbow"};
        description = "An oozing green blob, quivers and begins sliding toward you leaving a slimy trail on the stones.";
        drops.put(0, null);
        drops.put(1, null);
        drops.put(2, null);
        drops.put(3, null);
        drops.put(4, new String[]{"Health Potion"});
        drops.put(5, new String[]{"Health Potion"});
        drops.put(6, new String[]{"Key"});
        drops.put(7, new String[]{"Key"});
        drops.put(8, new String[]{"Key"});
        drops.put(9, new String[]{"Key"});
        Random random = new Random(seed);
        drop_num = random.nextInt(10)
    }
}

public class Spider extands Mob {
    public Spider(Long seed){
        type = "Spider";
        weak_to = new String[]{"Crossbow, Shield"};
        description = "Cowebs cover the ceiling, red eyes stare down at you";
        drops.put(0, null);
        drops.put(1, null);
        drops.put(2, null);
        drops.put(3, null);
        drops.put(4, new String[]{"Health Potion"});
        drops.put(5, new String[]{"Health Potion"});
        drops.put(6, new String[]{"Health Potion"});
        drops.put(7, new String[]{"Key"});
        drops.put(8, new String[]{"Key"});
        drops.put(9, new String[]{"Key"});
        Random random = new Random(seed);
        drop_num = random.nextInt(10)
    }
}