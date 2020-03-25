
package adarkroom;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ADarkRoom {

    public static void main(String[] args) {
        
        //Window.main(args);
        Window x = new Window();
        x.setVisible(true);
        
//        ADarkRoom myTimer = new ADarkRoom();
//        myTimer.timer.restart();
        
        String[] WoodTypes = new String[]{"Cedar","Oak","Maple"};
        Random Rand = new Random();
        ArrayList<Wood> logs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int FireTime = 0;
        boolean next = true;
                
        /*System.out.println("You are in a dark room.");
        System.out.println("There is an unlit fireplace in the centre of the room.");
        
        ChopWood(logs,WoodTypes);
        
        System.out.println("You have 5 logs of varying size and type.");
        System.out.println("Would you like to place them onto the fire (Y/N)?");
        String YorN = input.next();
        
        if(YorN.equals("Y")){
            System.out.println("You have placed your logs onto the fire.");
            while (!logs.isEmpty()) {
                if((logs.get(0).getWoodSize()) >= 3){
                    FireTime = FireTime + 20; 
                }
                else if((logs.get(0).getWoodSize()) >= 6){
                    FireTime = FireTime + 40;
                }
                else if((logs.get(0).getWoodSize()) >= 9){
                    FireTime = FireTime + 90;
                }
                else{
                    FireTime = FireTime + 10;
                }
                
                switch (logs.get(0).getWoodType()) {
                    case "Cedar":
                        FireTime = FireTime + 0;
                        break;
                    case "Maple":
                        FireTime = FireTime + 10;
                        break;
                    default:
                        FireTime = FireTime + 20;
                        break;
                }
                
                logs.remove(0);
            }
            
            System.out.println("Pheww. You're safe - for now. This fire will last you "+FireTime+" minutes.");
            System.out.println("Now that the room is brighter you look up and see a strange woman standing in the corner.");
            System.out.println("You gasp in shock.");
            System.out.println("Do want to approach her (Y), or leave it until later (N)?");
            YorN = input.next();
            
            if(YorN.equals("Y")){
                next = true;
            }
            else{
                next = false;
            }
        }
        else{
            System.out.println("You decide to hoard your wood instead of using it. Unfortunatly you freeze to death within 20mins...");
            System.exit(0);
        }
        
        if(next == true){
            System.out.println("You approach the woman");
            System.out.println("She seems to be ferrel.");
            System.out.println("You think again, should you approach her (Y/N)?");
            YorN = input.next();
        }
        if(YorN.equals("Y")){
            System.out.println("You decide to carry on.");
            System.out.println("You stand in front of her and say 'Hello?'");
            System.out.println("Sadly for you she sees this as a threat and so attacks and kills you.");
            System.exit(0);
        }
        else if(YorN.equals("N")){
            System.out.println("You decide to leave approaching her until you feel more safe.");
            System.out.println("Now you think to yourself what should you do next?");
            System.out.println("1. It's getting late, perhaps you should sleep, although the strange woman is still here...");
            System.out.println("2. Go out for an hour and collect resources.");
            System.out.println("3. Stay up for the rest of the night.");
            int option = input.nextInt();
            
            switch(option){
                case(1):
                    System.out.println("You decide that you are going to sleep the night.");
                    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
                    System.out.println("Half way through the night you wake up startled!");
                    System.out.println("The ferrel woman is attacking you.");
                    System.out.println("You slowly die a painful death.");
                    System.exit(0);
                case(2):
                    System.out.println("You decide to go out for an hour and chop some wood.");
                    ChopWood(logs,WoodTypes);
                    System.out.println("You now have " + logs.size() + " logs.");
                    break;
                case(3):
                    System.out.println("You've decided that you're going to try and stay awake for the night.");
                    System.out.println("Poor decision.");
                    System.out.println("The woman is still there the following morning.");
                    System.out.println("You feel safe.");
                    System.out.println("However your body, sleep deprived, begins to break down.");
                    System.out.println("This is the end of the line for you.");
                    System.exit(0);
            }
        }
        
        System.out.println("Now you have a few more resources you feel a bit more safe.");*/
    }
    
    public static void ChopWood(ArrayList logs, String[] WoodTypes){
        Random Rand = new Random();
        for (int i = 0; i < 5; i++) {
            int Number = Rand.nextInt(2);
            int Size = Rand.nextInt(10);
            Wood log = new Wood(Size , WoodTypes[Number]);
            logs.add(log);
        }        
    }
    
}
