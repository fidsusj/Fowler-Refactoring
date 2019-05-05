class Rental {

    private Movie movie;
    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    int getDaysRented() {
        return this.daysRented;
    }

    Movie getMovie() {
        return this.movie;
    }

    int getFrequentRenterPoints() {
        return this.movie.getFrequentRenterPoints(daysRented);
    }

    double getCharge() {
        return this.movie.getCharge(daysRented);
    }

}