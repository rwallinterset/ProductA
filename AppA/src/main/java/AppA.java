import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by rwall on 2016-10-17.
 */
public class AppA {
    public static String convertToTime(Long milliseconds) {
        Date date=new Date(milliseconds);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE,MMMM d,yyyy h:mm,a", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        return sdf.format(date);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println ( convertToTime ( 1476753947144L ) );
    }
}
