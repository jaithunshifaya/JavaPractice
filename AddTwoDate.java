import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AddTwoDate {
    public static void main(String[] args) {
        String dateStr = "31-12-2025";
        int daysToAdd = 3000;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        LocalDate newDate = date.plusDays(daysToAdd);

        System.out.println(newDate.format(formatter));
    }
}
