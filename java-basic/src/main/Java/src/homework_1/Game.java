package homework_1;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        int number = (int) (Math.random() * 101);
        Scanner cs = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = cs.next();
        while (true) {
            System.out.print("Enter your guess (0 to 100): ");
            if (cs.hasNextInt()) {
                int correct_number = cs.nextInt();
                if (correct_number > number) {
                    System.out.println("Your number is too big. Please, try again.");
                } else if (correct_number < number) {
                    System.out.println("Your number is too small. Please, try again.");
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            } else {
                System.out.println("Please enter a valid number.");
                cs.next();
            }
        }
    }
}
