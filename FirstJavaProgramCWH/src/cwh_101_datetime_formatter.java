import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetime_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
