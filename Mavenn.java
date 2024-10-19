import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class RandomDateGenerator {
    public static void main(String[] args) {
        // Define the start and end dates for the range
        Calendar start = Calendar.getInstance();
        start.set(2000, Calendar.JANUARY, 1); // Start date: January 1, 2000

        Calendar end = Calendar.getInstance();
        end.set(2023, Calendar.DECEMBER, 31); // End date: December 31, 2023

        // Generate a random date
        Date randomDate = getRandomDate(start.getTime(), end.getTime());
        System.out.println("Random Date: " + randomDate);
    }

    private static Date getRandomDate(Date start, Date end) {
        long startMillis = start.getTime();
        long endMillis = end.getTime();
        long randomMillis = startMillis + (long) (Math.random() * (endMillis - startMillis));
        return new Date(randomMillis);
    }
}
