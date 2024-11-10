package homework_1;

import java.util.Scanner;
import java.util.Random;

public class Shooting_Advanced {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }
        int targetStartRow = random.nextInt(5);
        int targetStartCol = random.nextInt(5);

        int direction = random.nextInt(2);
        if (direction == 0) {
            if (targetStartCol > 2) targetStartCol -= 2;
        } else {
            if (targetStartRow > 2) targetStartRow -= 2;
        }

        int targetRow1 = targetStartRow;
        int targetCol1 = targetStartCol;
        int targetRow2 = direction == 0 ? targetRow1 : targetRow1 + 1;
        int targetCol2 = direction == 0 ? targetCol1 + 1 : targetCol1;
        int targetRow3 = direction == 0 ? targetRow1 : targetRow1 + 2;
        int targetCol3 = direction == 0 ? targetCol1 + 2 : targetCol1;

        System.out.println("All Set. Get ready to rumble!");
        int hits = 0;

        while (hits < 3) {
            System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");

            printField(field);

            int row = getValidInput(scanner, "Enter row (1-5): ") - 1;  // від 1 до 5, але індекси з 0
            int col = getValidInput(scanner, "Enter column (1-5): ") - 1;  // від 1 до 5, але індекси з 0

            if ((row == targetRow1 && col == targetCol1) ||
                    (row == targetRow2 && col == targetCol2) ||
                    (row == targetRow3 && col == targetCol3)) {
                if (field[row][col] == '-') {
                    field[row][col] = 'x';
                    hits++;
                    System.out.println("Hit!");
                } else {
                    System.out.println("You already hit this cell.");
                }
            } else {
                field[row][col] = '*';  // позначаємо, що стріляли в цю клітинку
                System.out.println("Miss!");
            }
        }
        printField(field);
        System.out.println("You have won!");
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
