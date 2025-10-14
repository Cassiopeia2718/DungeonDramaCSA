import java.util.Scanner;
public class DungeonDrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name adventure!");
        String name = scanner.nextLine();
        String SEED = name;
        //Create Player Object with name, full health and starting inventory
        System.out.println("You find yourself in a circular room, the brick is mossy and cracked. The only breaks in the wall are three doors: 
                            on the left a large wrot Iron door, with rusted hinges(1), 
                            on the right a small Stone door that blends into the wall around it(2) 
                            and in the middle a plain red wooden door, one would find in a nice house(3) /n
                            which door do you choose?");
        /*while(player.alive) {
            if(player.keys < 3) {
            room = new Rooms(SEED);
            room.run();
            }
            room = new Rooms("Final Room");
            room.run
        }
        if (!player.alive) {
            System.out.println("You DIED with" + player.keys + "keys!")
        }
        
        */
        




    }
}