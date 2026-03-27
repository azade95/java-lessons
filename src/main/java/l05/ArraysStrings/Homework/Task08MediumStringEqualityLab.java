package l05.ArraysStrings.Homework;

public class Task08MediumStringEqualityLab {
    static void main() {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        String s4 = s3.intern();
        System.out.println(s1 == s4);
    }
}
