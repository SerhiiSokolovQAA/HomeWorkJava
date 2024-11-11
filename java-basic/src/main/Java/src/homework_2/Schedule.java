package homework_2;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "study programming";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to gym";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "read a book";
        schedule[5][0] = "Friday";
        schedule[5][1] = "meet friends";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "clean the house";

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = cs.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
                String day = input.toLowerCase();
                boolean validDay = false;

                switch (day) {
                    case "sunday":
                        System.out.println(schedule[0][0] + ": " + schedule[0][1]);
                        validDay = true;
                        break;
                    case "monday":
                        System.out.println(schedule[1][0] + ": " + schedule[1][1]);
                        validDay = true;
                        break;
                    case "tuesday":
                        System.out.println(schedule[2][0] + ": " + schedule[2][1]);
                        validDay = true;
                        break;
                    case "wednesday":
                        System.out.println(schedule[3][0] + ": " + schedule[3][1]);
                        validDay = true;
                        break;
                    case "thursday":
                        System.out.println(schedule[4][0] + ": " + schedule[4][1]);
                        validDay = true;
                        break;
                    case "friday":
                        System.out.println(schedule[5][0] + ": " + schedule[5][1]);
                        validDay = true;
                        break;
                    case "saturday":
                        System.out.println(schedule[6][0] + ": " + schedule[6][1]);
                        validDay = true;
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                        break;
                }
            }
        }
    }
