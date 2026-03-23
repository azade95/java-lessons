package l03.variables.homework;

public class Task04EasyCharCodes {
    public static void main(String[] args) {
        char c1='A';
        char c2 = '7';
        char c3 = '-';
        char c4 = '#';

        System.out.println(c1 + " -> " + (int) c1);
        System.out.println(c2 + " -> " + (int) c2);
        System.out.println(c3 + " -> " + (int) c3);
        System.out.println(c4 + " -> " + (int) c4);

        String c5="A\uD83D\uDE00";

        System.out.println("\nString: " + c5);
        System.out.println("length(): " + c5.length());
        System.out.println("codePointCount(): " + c5.codePointCount(0, c5.length()));
    }
}
