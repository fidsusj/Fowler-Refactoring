package java;

public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}