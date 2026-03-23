package l03.variables.homework;

import java.math.BigDecimal;

public class Task09HardSalarySlip {
    public static void main(String[] args) {

        final BigDecimal TAX_RATE = new BigDecimal("0.10");      // 10%
        final BigDecimal PENSION_RATE = new BigDecimal("0.05");  // 5%


        BigDecimal baseSalary = new BigDecimal("1500.00");
        BigDecimal overtimeHours = new BigDecimal("10");
        BigDecimal overtimeRate = new BigDecimal("20.00");
        BigDecimal bonus = new BigDecimal("200.00");


        BigDecimal overtimePay = overtimeHours.multiply(overtimeRate);
        BigDecimal grossSalary = baseSalary.add(overtimePay).add(bonus);

        BigDecimal taxAmount = grossSalary.multiply(TAX_RATE);
        BigDecimal pensionAmount = grossSalary.multiply(PENSION_RATE);

        BigDecimal netSalary = grossSalary.subtract(taxAmount).subtract(pensionAmount);


        System.out.println("========= Monthly Salary Slip =========");
        System.out.printf("%-20s : %10.2f%n", "Base Salary", baseSalary);
        System.out.printf("%-20s : %10.2f%n", "Overtime Pay", overtimePay);
        System.out.printf("%-20s : %10.2f%n", "Bonus", bonus);
        System.out.printf("%-20s : %10.2f%n", "Gross Salary", grossSalary);
        System.out.printf("%-20s : %10.2f%n", "Tax (10%)", taxAmount);
        System.out.printf("%-20s : %10.2f%n", "Pension (5%)", pensionAmount);
        System.out.printf("%-20s : %10.2f%n", "Net Salary", netSalary);
        System.out.println("======================================");
    }
}
