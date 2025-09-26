import java.util.Scanner;

public class logical_operators_3 {
   
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("You're playing a Game!! Press q or Q to quit!");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pow pow*");
            
        }
        else {
            System.out.println("You quit the game");
        }

        scanner.close();

    }
}