package l4.ControlFlow.Loops.Homework;

import java.util.Scanner;

public class Task03EasyRangePrinter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter start:");
        int start = scanner.nextInt();

        System.out.println("Enter end:");
        int end = scanner.nextInt();

        if(start>end){
            int tempNum = start;
            start=end;
            end=tempNum;

        }
        System.out.println("Range");
        int sum=0;
        for (int i=start;i<end; i++){
            System.out.println(i);
            sum+=i;

            if (i%3==0){
                System.out.println( i+ " 3-e bolunur");
            }

        }

        System.out.println("Total sum: " + sum);
    }
}
