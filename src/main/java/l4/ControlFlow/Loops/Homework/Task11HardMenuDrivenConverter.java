package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task11HardMenuDrivenConverter {
    static double cToF(double c) { return c * 9/5 + 32; }
    static double kmToMile(double km) { return km * 0.621371; }
    static double manatToUsd(double manat) { return manat * 0.59; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.C->F  2.KM->Mile  3.AZN->USD  0.Exit");
            int choice = sc.nextInt();

            if (choice == 0) break;

            System.out.print("Dəyər daxil et: ");
            double val = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println(cToF(val));
                case 2 -> System.out.println(kmToMile(val));
                case 3 -> System.out.println(manatToUsd(val));
                default -> System.out.println("Yanlış seçim");
            }
        }
    }
}
