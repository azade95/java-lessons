package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task07MediumMultiplicationGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N daxil et: ");
        int n = sc.nextInt();

        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int rowSum = 0;

            for (int j = 1; j <= n; j++) {
                int value = i * j;
                System.out.printf("%4d", value);

                rowSum += value;
                totalSum += value;
            }

            System.out.println(" | Row sum: " + rowSum);
        }

        System.out.println("Total sum: " + totalSum);
    }
}
