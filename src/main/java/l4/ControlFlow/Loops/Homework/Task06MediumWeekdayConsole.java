package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task06MediumWeekdayConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Gün (1-7) və ya exit: ");

            if (scanner.hasNextInt()) {
                int day = scanner.nextInt();
                scanner.nextLine();

                switch (day) {
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                    case 7 -> System.out.println("Sunday");
                    default -> {
                        System.out.println("Yanlış gün");
                        continue;
                    }
                }

                count++;

            } else {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Yanlış input");
                continue;
            }
        }

        System.out.println("Düzgün giriş sayı: " + count);
    }
}
