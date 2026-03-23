package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task09HardNumberAnalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        int sum = 0, pos = 0, neg = 0, zero = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            sum += x;

            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;

            if (x < min) min = x;
            if (x > max) max = x;
        }

        double avg = (double) sum / n;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
