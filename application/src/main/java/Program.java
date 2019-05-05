package java;

public class Program {

    public static void main(String args[]) {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("Movie1", 1);
        Movie m2 = new Movie("Movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("John");
        c1.addRental(r1);   c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);
    }
}
