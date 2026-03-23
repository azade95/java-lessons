package l03.variables.homework;

public class Task03EasyFuelUsage {
    public static void main(String[] args) {


        int distanceKm = 90;
        double fuelLiters = 12.5;

        double litersPer100Km = (fuelLiters / distanceKm) * 100;

        double pricePerLiter = 1.40;
        double estimatedTripCost = fuelLiters * pricePerLiter;


        System.out.printf("Distance: %d km%n", distanceKm);
        System.out.printf("Fuel Used: %.2f L%n", fuelLiters);
        System.out.printf("Consumption (per 100km): %.2f L%n", litersPer100Km);
        System.out.printf("Estimated Cost: %.2f AZN%n", estimatedTripCost);

    }
}
