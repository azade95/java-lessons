package l03.variables.homework;

import org.example.Main;

public class Task06MediumOverflowSafety {
    public static void main(String[] args) {
        int packageCounter = Integer.MAX_VALUE - 2;

        for (int i = 0; i < 3; i++) {
            packageCounter +=1;
            System.out.println("Step " + (i + 1) + ": " + packageCounter);


        }

        System.out.println("========== Math.Exact =========");

        int num= Integer.MAX_VALUE -2 ;
        for (int j = 0; j < 3; j++) {
            num = Math.addExact(num,1);
            System.out.println("Step (Math.Exact)" + (j + 1) + ": " + num);
        }
    }
}
