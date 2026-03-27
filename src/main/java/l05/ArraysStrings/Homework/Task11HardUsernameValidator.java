package l05.ArraysStrings.Homework;

import java.util.Scanner;

public class Task11HardUsernameValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String u = sc.nextLine();

        boolean valid = true;

        if (u.length() < 6 || u.length() > 20) {
            System.out.println("Invalid length");
            valid = false;
        }

        if (!Character.isLetter(u.charAt(0))) {
            System.out.println("Must start with letter");
            valid = false;
        }

        if (u.contains(" ")) {
            System.out.println("Cannot contain spaces");
            valid = false;
        }

        for (char c : u.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                System.out.println("Invalid character: " + c);
                valid = false;
            }
        }

        System.out.println(valid ? "VALID" : "INVALID");
    }
}
