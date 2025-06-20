import java.time.LocalDate;
public class AddTwoDate{
    public static void main(String[] args){
        String dateStr="29-12-2003";
        int daysToAdd=273;
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy);
        LocalDate date=LocalDate.parse(dateStr,formatter);
        LocalDate newDate=date.plusDays(daysToAdd);
        System.out.println(newDtae.format(formatter));
    }
}   
    
