package com.burak.java8features.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * Created by bk on 29/09/2017.
 */
public class Main {

  public static void main(String[] args) throws InterruptedException {
    Instant now = Instant.now();

    Thread.sleep(1000);

    System.out.println(now);
    /*2017-09-29T15:39:28.631Z*/

    Instant end = Instant.now();
    System.out.println(end);
    /*2017-09-29T15:39:29.693Z*/

    Duration elapse = Duration.between(now, end);
    System.out.println("Elapsed: " + elapse.toMillis() + " milliseconds");
    /*Elapsed: 1062 milliseconds*/

    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate);
    /*2017-09-29*/

    LocalDate specificDate = LocalDate.of(2000, 1, 1);
    System.out.println(specificDate);
    /*2000-01-01*/

    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    LocalTime specificTime = LocalTime.of(14, 0, 45);
    System.out.println(specificTime);

    LocalDateTime currentDT = LocalDateTime.now();
    System.out.println(currentDT);

    LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
    System.out.println(specificDT);

    LocalDate currentFormatted = LocalDate.now();
    DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
    System.out.println(df.format(currentFormatted));

    LocalTime currentTimeFormatted = LocalTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ISO_TIME;
    System.out.println(dtf.format(currentTimeFormatted));

    LocalDateTime currentLocalDateTimeFormatted = LocalDateTime.now();
    DateTimeFormatter dtff = DateTimeFormatter.ISO_DATE_TIME;
    System.out.println(dtff.format(currentLocalDateTimeFormatted));
    /*2017-09-29T18:39:29.71*/

    DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    System.out.println(f_long.format(currentDT));
    /*September 29, 2017*/

    String frenchLong = f_long.withLocale(Locale.FRENCH).format(currentDT);
    System.out.println(frenchLong);

    DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
            .appendValue(ChronoField.MONTH_OF_YEAR)
            .appendLiteral("||")
            .appendValue(ChronoField.DAY_OF_MONTH)
            .appendLiteral("||")
            .appendValue(ChronoField.YEAR);
    DateTimeFormatter d = builder.toFormatter();

    System.out.println(d.format(currentDT));
    /*9||29||2017*/
  }
}
