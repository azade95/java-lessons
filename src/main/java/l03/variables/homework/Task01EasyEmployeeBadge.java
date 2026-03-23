package l03.variables.homework;

public class Task01EasyEmployeeBadge {
    public static void main(String[] args) {

        // 1. Dəyişənlər
        String name = "Azade";
        int age = 22;
        String department = "IT";
        int yearsAtCompany = 2;
        boolean isActive = true;
        double hourlyRate = 15.0;

        // 2. Constant
        final String COMPANY_NAME = "Tech Corp";

        // 3. Maaşı artır
        hourlyRate += 2.5;

        // 4. Çap et
        System.out.printf(
                "Company: %s | Name: %s | Age: %d | Dept: %s | Years: %d | Active: %b | Rate: %.2f%n",
                COMPANY_NAME, name, age, department, yearsAtCompany, isActive, hourlyRate
        );
    }
}