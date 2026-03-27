package l05.ArraysStrings.Homework;

public class Task03EasyAgeStats {
    static void main(String[] args) {
        int[] ages= {19,22,24,26,46,50,55,26};

        int sum=0;


        for (int i = 0; i < ages.length; i++) {
            sum+=ages[i];

        }

        int avg= sum/ages.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
