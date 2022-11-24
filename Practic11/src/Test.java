import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
    public Test() {
        }
        public static void main(String[] args) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2002);
            cal.set(Calendar.MONTH, Calendar.AUGUST);
            cal.set(Calendar.DAY_OF_MONTH, 31);
            System.out.println(" Initialy set date: " +  sdf.format(cal.getTime()));
            cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
            System.out.println(" Date with month changed : "+ sdf.format(cal.getTime()));
            cal.set(Calendar.DAY_OF_MONTH,30);
            System.out.println(" Date with day changed: "+ sdf.format(cal.getTime()));
        }
}
