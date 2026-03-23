package l03.variables.homework;

public class Task08MediumPermissionFlags {
    public static void main(String[] args) {


        final int READ = 1;
        final int WRITE = 2;
        final int EXPORT = 4;
        final int AUDIT = 8;


        int mask = READ | WRITE;

        System.out.println("Initial mask: " + mask);


        boolean canRead = (mask & READ) != 0;
        boolean canWrite = (mask & WRITE) != 0;
        boolean canExport = (mask & EXPORT) != 0;

        System.out.println("Can READ: " + canRead);
        System.out.println("Can WRITE: " + canWrite);
        System.out.println("Can EXPORT: " + canExport);


        mask |= EXPORT;
        System.out.println("\nAfter adding EXPORT: " + mask);


        mask &= ~WRITE;
        System.out.println("After removing WRITE: " + mask);


        mask ^= AUDIT;
        System.out.println("After toggling AUDIT: " + mask);


        System.out.println("\nFinal mask (decimal): " + mask);
        System.out.println("Final mask (binary): " + Integer.toBinaryString(mask));
    }
}
