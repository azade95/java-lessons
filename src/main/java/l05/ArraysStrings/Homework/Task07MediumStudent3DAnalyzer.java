package l05.ArraysStrings.Homework;

public class Task07MediumStudent3DAnalyzer {
    public static void main(String[] args) {
        int[][][] marks = {
                {{80, 85}, {70, 75}},
                {{90, 95}, {88, 92}}
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + i);

            int total = 0;
            int count = 0;

            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("Subject " + j + " Semester " + k + ": " + marks[i][j][k]);
                    total += marks[i][j][k];
                    count++;
                }
            }

            System.out.println("Average: " + (total / count));
        }
    }
}
