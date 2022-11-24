import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Program {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        System.out.printf("%d/%d/%d \n", year, month, dayOfMonth);
        Date neww = new Date();
        System.out.printf(String.valueOf(neww.getHours()) + ':' + neww.getMinutes());
        System.out.println();
        // Calendar
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd \nHH:mm");
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
    }
}