import java.util.Scanner;
public class Room {

    private int doors = 1;

    private String description;

    public Mob mob;

    public static Room new_room(Long seed) {
            Random random = new Random(seed);
            int option = random.nextInt(4);
            switch (option) {
            case 0: return new Hallway(seed);
            case 1: return new Treasure(seed+1);
            case 2: return new Large(seed+2);
            case 3: return new Fountain(seed+3);
            case default: throw new IllegalStateException();
            }
    }

    public static Room new_room(String name, Long seed) {
            switch (name) {
            case "Hallway": return new Hallway(seed);
            case "Treasure": return new Treasure(seed);
            case "Large": return new Large(seed);
            case "Fountain": return new Fountain(seed);
            case "Final Room": return new FinalRoom(seed);
            case default: throw new IllegalStateException();
            }
        
    }

    public int getDoors() {
        return this.doors;
    }

    public String getDescription() {
        return this.description;
    }


}

public class Hallway extends Room {
    this.doors = 1;
    



}

public class Treasure extends Room {


}

public class Large extends Room {

}

public class Fountain extends Room {

}

public class FinalRoom extends Room {

}