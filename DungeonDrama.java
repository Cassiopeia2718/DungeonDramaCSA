import java.util.Scanner;
public class DungeonDrama {
    public static void main(String[] args) {
        //Creates scanner that will be passed into the run methods every time
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name adventurer?");
        String name = scanner.nextLine();
        Long SEED = Long.valueOf(name); //Seed to be put into the room creation and modified based on decision tree
        Player player = new Player(name); //Creates player object with full heatlh and inventory
        System.out.println("You find yourself in a dark room. Three doors are ahead of you: 
                            On your left, a wrought iron door, with rusted hinges(1), 
                            On the right, a small stone door that blends into the wall(2) 
                            And in the middle, a plain red wooden door, with mold speckling the edges.(3) /n
                            Which door do you choose?");

        while(player.alive()) {
            if(player.keys() < 3) {
            Room current_room = new Room(SEED); //Runs room based on current seed
            current_room.run(scanner); 
            SEED = current_room.getSeed(); 
            } else {
            Room current_room = new Room("Final Room"); //Runs room based on the "Final Room" Seed
            current_room.run(scanner); 
            SEED = current_room.getSeed();
            }
        }
    }
}
