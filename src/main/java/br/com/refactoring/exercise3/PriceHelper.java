package br.com.refactoring.exercise3;

public class PriceHelper {
    public static final double DEFAULT_PRICE_SCALER = 1.00;
    public static final double HOLIDAY_DISCOUNT = 0.05;
    public static final double CUSTOMER_ONE_DISCOUNT = 0.1;
    public static final double CUSTOMER_TWO_DISCOUNT = 0.15;
    public static final double NO_DISCOUNT = 0.00;

    public double calculatePrice(double basePrice, int customerType, boolean isHoliday) {
        double holidayDiscount = calculateHolidayDiscount(isHoliday);
        double customerTypeDiscount = calculateCustomerTypeDiscount(customerType);
        double discount = holidayDiscount + customerTypeDiscount;

        return basePrice * (DEFAULT_PRICE_SCALER - discount);
    }

    private double calculateHolidayDiscount(boolean isHoliday) {
        if (isHoliday) {
            return HOLIDAY_DISCOUNT;
        }
        return NO_DISCOUNT;
    }

    private double calculateCustomerTypeDiscount(int customerType) {
        return switch (customerType) {
            case 1 -> CUSTOMER_ONE_DISCOUNT;
            case 2 -> CUSTOMER_TWO_DISCOUNT;
            default -> NO_DISCOUNT;
        };
    }
}
