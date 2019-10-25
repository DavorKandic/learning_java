import java.util.Scanner;
/**
 * Simple practice of switch-statement
 *
 * @author Davor Kandic
 * @version 1.0
 */
public class Switch
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String command = "";
        boolean isActivated = false;
        do{
        System.out.println("Please, enter a command: ");
        command = scan.nextLine();
        
        switch(command){
            case "start":
                if (!isActivated) {
                    System.out.println("Machine started!");
                    isActivated = true;
                } else {
                    System.out.println("Machine is already activated.");
                }
                break;
                
            case "stop":
                if (isActivated) {
                    System.out.println("Machine stopped.");
                    isActivated = false;
                } else {
                    System.out.println("Machine is already turned off.");
                }
                break;
                
            case "quit":
                System.out.println("Bye-bye!");
                break;
                
            default: 
                System.out.println("Command not recognized.");
            }   
    }while (!command.equals("quit"));
}
}
