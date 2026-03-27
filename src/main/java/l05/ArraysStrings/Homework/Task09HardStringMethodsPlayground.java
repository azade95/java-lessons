package l05.ArraysStrings.Homework;

public class Task09HardStringMethodsPlayground {
    public static void main(String[] args) {

        String text = "  Java,Arrays,Strings  ";

        System.out.println("Length: " + text.length());
        System.out.println("CharAt(2): " + text.charAt(2));
        System.out.println("IndexOf: " + text.indexOf("Java"));

        System.out.println("Substring: " + text.substring(2, 6));
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Lower: " + text.toLowerCase());

        System.out.println("StartsWith: " + text.startsWith(" "));
        System.out.println("EndsWith: " + text.endsWith(" "));
        System.out.println("Contains: " + text.contains("Arrays"));

        System.out.println("Replace: " + text.replace("Java", "C++"));
        System.out.println("isEmpty: " + text.isEmpty());
        System.out.println("isBlank: " + text.isBlank());

        System.out.println("Trim: [" + text.trim() + "]");
        System.out.println("Strip: [" + text.strip() + "]");

        int index = 100;
        if (index >= 0 && index < text.length()) {
            System.out.println(text.charAt(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

}
