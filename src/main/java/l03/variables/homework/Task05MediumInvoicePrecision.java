package l03.variables.homework;

import java.math.BigDecimal;

public class Task05MediumInvoicePrecision {
    public static void main(String[] args) {
        double num1= 19.99;
        double num2= 5.75;
        double num3= 2.40;

        double total1= num1+num2+num3;

        System.out.println("Double total: "+ total1);

        BigDecimal number1= new BigDecimal("19.99");
        BigDecimal number2= new BigDecimal("5.75");
        BigDecimal number3= new BigDecimal("2.40");

        BigDecimal total2= number1.add(number2).add(number3);

        System.out.println("BigDecimal Total: "+ total2);

        BigDecimal diff= total2.subtract(BigDecimal.valueOf(total1));

        System.out.println("Difference: "+ diff);


    }
}
