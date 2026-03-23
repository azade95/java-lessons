package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task12HardQuizEngine {

    static String[] questions = {
            "Java hansı dildir?",
            "2+2=?",
            "Switch nə üçündür?",
            "Loop nədir?",
            "JVM nədir?"
    };

    static String[] answers = {
            "programming",
            "4",
            "decision",
            "loop",
            "virtual machine"
    };

    static int askQuestion(Scanner sc, int i) {
        System.out.println(questions[i]);
        String ans = sc.nextLine();
        return ans.equalsIgnoreCase(answers[i]) ? 1 : 0;
    }

    static void printReport(int score) {
        System.out.println("Score: " + score);

        if (score == 5) System.out.println("A");
        else if (score >= 3) System.out.println("B");
        else if (score >= 2) System.out.println("C");
        else System.out.println("F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int score = 0;

            for (int i = 0; i < questions.length; i++) {
                score += askQuestion(sc, i);
            }

            printReport(score);

            System.out.print("Yenidən? (y/n): ");
            if (!sc.nextLine().equalsIgnoreCase("y")) break;
        }
    }
}
