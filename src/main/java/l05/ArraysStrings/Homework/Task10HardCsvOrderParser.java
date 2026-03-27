package l05.ArraysStrings.Homework;

public class Task10HardCsvOrderParser {
    public static void main(String[] args) {

        String input = "apple:2,banana:5,orange:3";

        String[] parts = input.split(",");

        String[] items = new String[parts.length];
        int[] qty = new int[parts.length];

        int total = 0;

        for (int i = 0; i < parts.length; i++) {
            String[] pair = parts[i].split(":");
            items[i] = pair[0];
            qty[i] = Integer.parseInt(pair[1]);
            total += qty[i];
        }

        System.out.println("Total items: " + total);
    }
}
