package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;
public class Task04EasyPinValidation {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            final int correctPin = 1234;
            int enteredPin;
            int attempts = 0;
            final int maxAttempts = 3;

            boolean isSuccess = false;

            do {
                System.out.print("PIN daxil et: ");
                enteredPin = scanner.nextInt();

                attempts++;

                if (enteredPin == correctPin) {
                    isSuccess = true;
                    System.out.println("Uğurlu giriş!");
                    break;
                } else {
                    System.out.println("Yanlış PIN!");
                }

            } while (attempts < maxAttempts);

            if (!isSuccess) {
                System.out.println("Hesab bloklandı!");
            }

    }
}
