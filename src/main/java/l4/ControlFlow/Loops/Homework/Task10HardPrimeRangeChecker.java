package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task10HardPrimeRangeChecker {
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Prime count: " + count);
    }
}
