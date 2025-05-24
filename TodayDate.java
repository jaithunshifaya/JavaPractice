import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayDate {
    public static void main(String[] args) {
        Date today = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(today);
        System.out.println("Today's Date: " + formattedDate);
    }
}
