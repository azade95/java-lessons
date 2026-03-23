package l03.variables.homework;

public class Task12HardCheckoutDebug {

        public static void main(String[] args) {

            int price = 99;
            int discountPercent = 20;
            int discount = price * (discountPercent / 100);
            int totalPrice = price - discount;
            System.out.println("Buggy Total Price: " + totalPrice);

            String userInput = "SAVE20";
            String promoCode = "SAVE20";
            if (userInput == promoCode) {
                System.out.println("Buggy promo applied!");
            } else {
                System.out.println("Buggy promo not applied!");
            }

            int order1 = Integer.MAX_VALUE;
            int order2 = 100;
            int totalOrder = order1 + order2;
            System.out.println("Buggy total order: " + totalOrder);


            double discountFixed = price * ((double) discountPercent / 100);
            double totalPriceFixed = price - discountFixed;
            System.out.println("Fixed Total Price: " + totalPriceFixed + "  // Casting to double fixes integer division");


            if (userInput.equals(promoCode)) {
                System.out.println("Fixed promo applied!  // .equals compares string content correctly");
            } else {
                System.out.println("Fixed promo not applied!");
            }


            try {
                int totalOrderFixed = Math.addExact(order1, order2);
                System.out.println("Fixed total order: " + totalOrderFixed + "  // Math.addExact prevents overflow");
            } catch (ArithmeticException e) {
                System.out.println("Overflow detected! Cannot add order1 + order2 safely");
            }
        }
    }

