package homework_1;

import java.util.Random;
import java.util.Scanner;

public class Game_Advanced {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");

        String[][] events = {
                {"1939", "When did the World War II begin?"},
                {"1969", "When did the first human land on the Moon?"},
                {"1991", "When did the Soviet Union dissolve?"},
                {"1892", "When did the Liverpool football club was created?"}
        };
        Random random = new Random();
        int eventIndex = random.nextInt(events.length);
        int targetNumber = Integer.parseInt(events[eventIndex][0]);
        String question = events[eventIndex][1];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + "! " + question);
        int[] guesses = new int[100];
        int attempts = 0;

        while (true) {
            System.out.print("Guess the number: ");
            int guess;
            try {
                guess = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            guesses[attempts] = guess;
            attempts++;

            if (guess > targetNumber) {
                System.out.println("Selected year is too big. Please, try again.");
            } else if (guess < targetNumber) {
                System.out.println("Selected year is too small. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        System.out.print("Your numbers: ");
        for (int i = 0; i < attempts; i++) {
            System.out.print(guesses[i] + " ");
        }
    }

}
