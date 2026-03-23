package l03.variables.homework;

public class Task02EasyCartTotals {
    public static void main(String[] args) {
           int quantity1=3;
           double price1= 5.5;

           int quantity2=5;
           double price2=7.8;

           int quantity3= 4;
           double price3 =6;

           double subtotal= quantity1 * price1 + quantity2 * price2 +quantity3 * price3;

           double deliveryFee= 2.5;
           double platformFee= 2;

          double finalTotal=subtotal;
           finalTotal+=deliveryFee;
           finalTotal+=platformFee;

           double discount = 5.5;
           finalTotal-=discount;

        System.out.printf("Subtotal: %.2f%n" , subtotal);
        System.out.printf("Delivery Fee: %.2f%n", deliveryFee);
        System.out.printf("Platform Fee: %.2f%n", platformFee);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final Total: %.2f%n", finalTotal);
    }
}
