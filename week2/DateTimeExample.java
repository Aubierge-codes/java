import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

    public static void main(String[] args) {

        // A date without a time
        LocalDate today = LocalDate.now();

        System.out.println("Today: " + today);


        // A time without a date
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current time: " + currentTime);


        // Both date and time
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current date and time: " + now);


        // Creating a specific date
        LocalDate birthday = LocalDate.of(2010, 5, 20);

        System.out.println("\nBirthday: " + birthday);


        // Adding and subtracting time
        LocalDate nextWeek = today.plusDays(7);
        LocalDate previousWeek = today.minusDays(7);

        System.out.println("Next week: " + nextWeek);
        System.out.println("Previous week: " + previousWeek);


        // Formatting a date
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = today.format(formatter);

        System.out.println("Formatted date: " + formattedDate);


        // Calculating the period between two dates
        LocalDate graduationDate =
                LocalDate.of(2030, 6, 30);

        Period period =
                Period.between(today, graduationDate);

        System.out.println("\nTime until graduation:");
        System.out.println(
                period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days"
        );
    }
}