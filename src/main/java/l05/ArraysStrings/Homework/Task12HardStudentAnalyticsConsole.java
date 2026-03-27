package l05.ArraysStrings.Homework;
import java.util.Scanner;
public class Task12HardStudentAnalyticsConsole {
    public static void main(String[] args) {
        String[] names = {"Ali", "Veli", "Aysel"};
        int[][] grades = {
                {80, 90},
                {70, 60},
                {95, 85}
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 Show all");
            System.out.println("2 Top student");
            System.out.println("3 Search");
            System.out.println("0 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            switch (choice) {
                case 1:
                    for (int i = 0; i < names.length; i++) {
                        int avg = (grades[i][0] + grades[i][1]) / 2;
                        System.out.println(names[i] + " Avg: " + avg);
                    }
                    break;

                case 2:
                    int best = 0;
                    int max = 0;

                    for (int i = 0; i < names.length; i++) {
                        int avg = (grades[i][0] + grades[i][1]) / 2;
                        if (avg > max) {
                            max = avg;
                            best = i;
                        }
                    }
                    System.out.println("Top: " + names[best]);
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Found: " + names[i]);
                            found = true;
                        }
                    }

                    if (!found) System.out.println("Not found");
                    break;
            }
        }
    }
}
