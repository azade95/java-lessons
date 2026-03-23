package l03.variables.homework;

public class Task07MediumCastingData {
 public static void main(String[] args) {
     double number1= 127.85;
     int castToInt= (int) number1;

     int number2= 140;
     byte castToByte= (byte)  number2;

     byte sensor1= 45;
     byte sensor2= 28;

     int sum= sensor1 + sensor2;
     byte castedSum= (byte) sum;

     System.out.println("Double value: " + number1);
     System.out.println("After casting to int: " + castToInt);

     System.out.println("Int value: " + number2);
     System.out.println("After casting to byte: " + castToByte);

     System.out.println("Byte values: " + sensor1 + " + " + sensor2);
     System.out.println("Sum as int: " + sum);
     System.out.println("Sum casted back to byte: " + castedSum);
 }
}
