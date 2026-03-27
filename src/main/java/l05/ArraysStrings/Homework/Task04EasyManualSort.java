package l05.ArraysStrings.Homework;

import java.util.Arrays;

public class Task04EasyManualSort {
    static void main() {

        int[] arr={28,17,99,167,44,53,2,87};
        int[] copy= arr.clone();

        for (int i = 0; i < copy.length-1; i++) {
            for (int j = 0; j < copy.length-i-1; j++) {
                if (copy[j]>copy[j+1]){
                    int temp=copy[j];
                    copy[j]=copy[j+1];
                    copy[j+1]=temp;
                }
            }

        }

        System.out.println(Arrays.toString(copy));
    }
}
