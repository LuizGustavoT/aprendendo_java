import java.util.Scanner;

public class if_and_else {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        if (age>=75) {
            System.out.println(+age+"? Ok YOU'RE VERY OLD!!!");
        }
            else if (age>=18){
                System.out.println("You're "+age+", You're an Adult! ");
            }
            else if (age>=13) {
                System.out.println("You're "+age+", You're a Teenager!");
            }

            else {
                System.out.println("You're "+age+", You're not an Adult!!");
            }
            scanner.close();
    }
}
