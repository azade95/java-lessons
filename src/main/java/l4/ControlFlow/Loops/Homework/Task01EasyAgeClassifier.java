package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task01EasyAgeClassifier  {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age");
        
        int age= scanner.nextInt();

        if (age<0){
            System.out.println("Invalid Input");
        } else if (age<12) {
            System.out.println("You are child");
        } else if (age<17 ) {
            System.out.println("You are teen");
        } else if (age<64 ) {
            System.out.println("You are adult");
        }else {
            System.out.println("You are senior");
        }
    }
}
