package l03.variables.homework;
import java.nio.charset.StandardCharsets;
public class Task10HardEncodingCheck {
    public static void main(String[] args) {
        String productTitle = "Café Bakı 😀";
        byte[] utf8Bytes = productTitle.getBytes(StandardCharsets.UTF_8);
        byte[] isoBytes = productTitle.getBytes(StandardCharsets.ISO_8859_1);


        System.out.println("String length(): " + productTitle.length());
        System.out.println("Code point count: " + productTitle.codePointCount(0, productTitle.length()));
        System.out.println("UTF-8 byte count: " + utf8Bytes.length);
        System.out.println("ISO-8859-1 byte count: " + isoBytes.length);

        char firstChar = productTitle.charAt(0);
        char secondChar = productTitle.charAt(1);

        System.out.println("First char: " + firstChar + " = " + (int)firstChar);
        System.out.println("Second char: " + secondChar + " = " + (int)secondChar);
    }
}
