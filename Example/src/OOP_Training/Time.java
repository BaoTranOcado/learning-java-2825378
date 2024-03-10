package OOP_Training;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Time {
    public Time () {
        Date now = new Date();
        LocalDateTime ldt = LocalDateTime.now();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(now));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(ldt));
    }
}
