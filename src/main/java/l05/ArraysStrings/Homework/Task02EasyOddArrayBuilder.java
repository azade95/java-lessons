package l05.ArraysStrings.Homework;

import java.util.Arrays;

public class Task02EasyOddArrayBuilder {
    static void main(String[] args) {
        int[] oddNums= new int[50];


        for (int i = 0; i < oddNums.length; i++) {
            oddNums[i]=2*i+1;
        }

        System.out.println(Arrays.toString(oddNums));
        System.out.println("First: " + oddNums[0]);
        System.out.println("Last: " + oddNums[49]);

    }
}
