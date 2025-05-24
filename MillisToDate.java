import java.util.Date;

public class MillisToDate {
    public static void main(String[] args) {
        long milliseconds = 1682000000000L;
        Date date = new Date(milliseconds);
        System.out.println("Date: " + date);
    }
}
