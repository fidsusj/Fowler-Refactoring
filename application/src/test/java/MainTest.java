import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@SuppressWarnings("WeakerAccess")
class MainTest {

    private static Customer customer;
    private static Rental firstRental;
    private static Rental secondRental;

    @BeforeAll
    public static void initializeTests(){
        firstRental = new Rental(new Movie("movie1", 1), 10);
        secondRental = new Rental(new Movie("movie2", 2), 5);
        customer = new Customer("joe");
        customer.addRental(firstRental);
        customer.addRental(secondRental);
    }

     @Test
    public void testGetCharge(){
        Assertions.assertEquals(30, firstRental.getCharge());
        Assertions.assertEquals(4.5, secondRental.getCharge());
    }

    @Test
    public void testGetFrequentRenterPoints(){
        Assertions.assertEquals(2, firstRental.getFrequentRenterPoints());
        Assertions.assertEquals(1, secondRental.getFrequentRenterPoints());
    }

    @Test
    public void testGetTotalCharge(){
        Assertions.assertEquals(34.5, customer.getTotalCharge());
    }

    @Test
    public void testGetTotalFrequentRenterPoints(){
        Assertions.assertEquals(3, customer.getTotalFrequentRenterPoints());
    }

}