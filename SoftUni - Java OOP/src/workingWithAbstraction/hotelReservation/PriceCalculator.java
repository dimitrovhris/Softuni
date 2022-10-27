package workingWithAbstraction.hotelReservation;

public class PriceCalculator {
    public static double calculateHolidayPrice(String[] array){
        double pricePerDay = Double.parseDouble(array[0]);
        int numberOfDays = Integer.parseInt(array[1]);
        Season season = Season.valueOf(array[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(array[3].toUpperCase());

        double totalPrice = pricePerDay * season.getCoefficient() * numberOfDays;
        totalPrice -= discountType.getPercent() / 100 * totalPrice;
        return totalPrice;
    }
}
