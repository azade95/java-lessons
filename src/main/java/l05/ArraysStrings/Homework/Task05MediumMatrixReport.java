package l05.ArraysStrings.Homework;

public class Task05MediumMatrixReport {
    static void main() {
      int[][] matrix ={
            {2,5,6,8},
            {7,1,9,6},
            {11,5,9,3}
        };
        int total=0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                rowSum += matrix[i][j];
                total += matrix[i][j];
            }
            System.out.println("| Row sum: " + rowSum);

        }

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
                total+= matrix[i][j];
            }
            System.out.println("Column " + j + " sum: " + colSum);
        }

        System.out.println("Total: " + total);

    }
}
