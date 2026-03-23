package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task02EasyDayTypeSwitch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter week day with number:");

        String weekDayNum= scanner.nextLine();
        int day = Integer.parseInt(weekDayNum);
        String weekday= switch (weekDayNum){
            case "1"-> "Monday";
            case "2"-> "Tuesday";
            case "3" -> "Wednesday";
            case "4" -> "Thursday";
            case "5" -> "Friday";
            case "6" -> "Saturday";
            case "7" -> "Sunday";
            default -> "Invalid input";
        };

        System.out.println("Day: " + weekday);

        if (day>=1 && day<=5){
            System.out.println("Weekday:(");
        }
        else if(day>5 && day<=7){
            System.out.println("Weekend:)");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
