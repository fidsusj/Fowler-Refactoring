package java;

@SuppressWarnings("WeakerAccess")
public class Movie {

    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    static final int CHILDRENS = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle (){
        return this.title;
    }

    public double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }

    public void setPriceCode(int arg) {
        switch(arg) {
            case REGULAR: price = new RegularPrice();
                          break;
            case CHILDRENS: price = new ChildrensPrice();
                            break;
            case NEW_RELEASE: price = new NewReleasePrice();
                              break;
            default: throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

}