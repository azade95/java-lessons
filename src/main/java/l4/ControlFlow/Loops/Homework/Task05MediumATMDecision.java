package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task05MediumATMDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balans daxil et: ");
        double balance = sc.nextDouble();

        System.out.print("Çıxarılacaq məbləğ: ");
        double amount = sc.nextDouble();

        if (balance <= 0) {
            System.out.println("Vəsait yoxdur");
        } else if (amount <= 0) {
            System.out.println("Yanlış məbləğ");
        } else if (amount > balance) {
            System.out.println("Kifayət qədər balans yoxdur");
        } else if (amount > 500) {
            System.out.println("OTP tələb olunur");
        } else {
            balance -= amount;
            System.out.println("Əməliyyat təsdiqləndi. Yeni balans: " + balance);
        }
    }
}
