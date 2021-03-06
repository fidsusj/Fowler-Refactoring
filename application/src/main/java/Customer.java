package java;

import java.util.Enumeration;
import java.util.Vector;

@SuppressWarnings("WeakerAccess")
public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer (String newname){
        this.name = newname;
    }

    public void addRental(Rental arg) {
        this.rentals.addElement(arg);
    }

    public String statement() {
        Enumeration<Rental> enum_rentals = rentals.elements();

        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ").append(this.name).append("\n");
        result.append("\t").append("Title").append("\t").append("\t").append("Days").append("\t").append("Amount").append("\n");

        while (enum_rentals.hasMoreElements()) {
            Rental each = enum_rentals.nextElement();
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append("\t").append(each.getDaysRented()).append("\t").append("\t").append(String.valueOf(each.getCharge())).append("\n");
        }

        result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");

        return result.toString();
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

}