package l03.variables.homework;

public class Task11HardSensorPacket {
    public static void main(String[] args) {
        int temperature = 45;
        int humidity = 100;
        int battery = 12;

        int packed = (battery << (7 + 6)) | (humidity << 6) | temperature;

        int unpackedTemperature = packed & 0b111111;           
        int unpackedHumidity = (packed >> 6) & 0b1111111;      
        int unpackedBattery = (packed >> 13) & 0b1111;

        System.out.println("Original Temperature: " + temperature);
        System.out.println("Original Humidity: " + humidity);
        System.out.println("Original Battery: " + battery);

        System.out.println("Packed integer: " + packed);
        System.out.println("Packed binary: " + Integer.toBinaryString(packed));

        System.out.println("Unpacked Temperature: " + unpackedTemperature);
        System.out.println("Unpacked Humidity: " + unpackedHumidity);
        System.out.println("Unpacked Battery: " + unpackedBattery);
    }
}
