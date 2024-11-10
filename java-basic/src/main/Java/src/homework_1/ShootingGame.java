package homework_1;

import java.util.Scanner;
import java.util.Random;

public class ShootingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All Set. Get ready to rumble!");

        while (true) {
            System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
            printField(field);
            int row = getValidInput(scanner, "Enter row (1-5): ") - 1;
            int col = getValidInput(scanner, "Enter column (1-5): ") - 1;

            // Перевірка на попадання
            if (row == targetRow && col == targetCol) {
                field[row][col] = 'x';
                printField(field);
                System.out.println("You have won!");
                break;
            } else {
                field[row][col] = '*';
            }
        }
        scanner.close();
    }
    private static void printField(char[][] field) {
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println("|");
        }
    }
    private static int getValidInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    return input;
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }
}
