import java.util.Scanner;

public class conversation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's Yor Name? ");
        String name = scanner.nextLine();

        System.out.println("How Old are You? ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("What's Your Favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" Years Old");
        System.out.println("Ok that's great "+food+" is delicious!!");
        
        scanner.close(); // Fechei o scanner para que não ficasse acusando Warning
    }
}