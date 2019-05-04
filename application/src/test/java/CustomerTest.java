import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@SuppressWarnings("WeakerAccess")
class CustomerTest {

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
    public void testAmountFor(){
        Assertions.assertEquals(30, firstRental.getCharge());
        Assertions.assertEquals(4.5, secondRental.getCharge());
    }

}