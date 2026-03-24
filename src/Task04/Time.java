package Task04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time {

    String time;
    public Time(String time) {
        this.time = time;
    }

    public void calculateTime() {
        String [] parts = time.split("-");
        String startTime = parts[0];
        String endTime = parts[1];
        DateTimeFormatter format = DateTimeFormatter.ofPattern("h.mma", Locale.US);
        LocalTime start = LocalTime.parse(startTime, format);
        LocalTime end = LocalTime.parse(endTime, format);

        long difference = (java.time.Duration.between(start, end).toMillis()) ;
        System.out.println("Między " + startTime + " a " + endTime + " upłyneło: " + ((difference/1000)/60)/60 + " godzin");
        System.out.println("Czyli: ");
        System.out.println("Między " + startTime + " a " + endTime + " upłyneło: " + (difference/1000)/60 + " minut");
        System.out.println("Czyli: ");
        System.out.println("Między " + startTime + " a " + endTime + " upłyneło: " + difference/1000 + " sekund");

    }

}
