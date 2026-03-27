package l05.ArraysStrings.Homework;

import java.util.Scanner;

public class Task06MediumSeatFinder {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat: ");
        String input = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].equalsIgnoreCase(input)) {
                    System.out.println("Found at row: " + i + ", column: " + j);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Seat not found");
        }
    }
}
