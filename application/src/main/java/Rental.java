package java;

@SuppressWarnings("WeakerAccess")
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getFrequentRenterPoints() {
        return this.movie.getFrequentRenterPoints(daysRented);
    }

    public double getCharge() {
        return this.movie.getCharge(daysRented);
    }

}