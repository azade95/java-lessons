package l05.ArraysStrings.Homework;

import java.util.Arrays;

public class Task01EasyArrayWarmup {
   public static void main(String[] args) {
       int[] nums= new int[10];

       nums[0]=5;
       nums[9]=99;

       System.out.println(Arrays.toString(nums));

       for (int i = 0; i < nums.length; i++) {

           System.out.println("Index: "+i+ "Value: " + nums[i]);

       }
   }

}
