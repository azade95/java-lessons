package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task08MediumMethodCalculator {
    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }

    static Integer div(int a, int b) {
        if (b == 0) {
            System.out.println("0-a bölmək olmaz!");
            return null;
        }
        return a / b;
    }

    static Integer calculate(int a, int b, char op) {
        switch (op) {
            case '+': return add(a, b);
            case '-': return sub(a, b);
            case '*': return mul(a, b);
            case '/': return div(a, b);
            default:
                System.out.println("Yanlış operator");
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (!sc.hasNextInt()) break;
            int a = sc.nextInt();

            if (!sc.hasNextInt()) break;
            int b = sc.nextInt();

            char op = sc.next().charAt(0);

            Integer result = calculate(a, b, op);

            if (result != null) {
                System.out.println("Nəticə: " + result);
            }

            System.out.print("Davam edək? (y/n): ");
            if (!sc.next().equalsIgnoreCase("y")) break;
        }
    }
}
