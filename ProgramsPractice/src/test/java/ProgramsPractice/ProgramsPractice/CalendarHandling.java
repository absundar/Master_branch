package ProgramsPractice.ProgramsPractice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;

public class CalendarHandling {
	    public static void main(String[] args) {

	        // 1. Current Date and Time
	        LocalDate today = LocalDate.now();
	        LocalTime nowTime = LocalTime.now();
	        LocalDateTime nowDateTime = LocalDateTime.now();
	        ZonedDateTime nowZoned = ZonedDateTime.now(); // With time zone

	        System.out.println("Today's date: " + today);
	        System.out.println("Current time: " + nowTime);
	        System.out.println("Current date and time: " + nowDateTime);
	        System.out.println("Current date and time with zone: " + nowZoned);

	        // 2. Creating Specific Dates and Times
	        LocalDate specificDate = LocalDate.of(2024, Month.DECEMBER, 25); // Using Month enum
	        LocalTime specificTime = LocalTime.of(10, 30, 0); // 10:30 AM
	        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 10, 30);
	        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("Asia/Kolkata"));

	        System.out.println("\nSpecific date: " + specificDate);
	        System.out.println("Specific time: " + specificTime);
	        System.out.println("Specific date and time: " + specificDateTime);
	        System.out.println("Specific date and time with zone: " + specificZonedDateTime);


	        // 3. Date and Time Components
	        int year = today.getYear();
	        Month month = today.getMonth();
	        int dayOfMonth = today.getDayOfMonth();
	        DayOfWeek dayOfWeek = today.getDayOfWeek();

	        System.out.println("\nYear: " + year);
	        System.out.println("Month: " + month);
	        System.out.println("Day of month: " + dayOfMonth);
	        System.out.println("Day of week: " + dayOfWeek);

	        // 4. Date and Time Manipulation (Immutable)
	        LocalDate tomorrow = today.plusDays(1);
	        LocalDate lastMonth = today.minusMonths(1);
	        LocalDateTime nextHour = nowDateTime.plusHours(1);

	        System.out.println("\nTomorrow: " + tomorrow);
	        System.out.println("Last month: " + lastMonth);
	        System.out.println("Next hour: " + nextHour);

	        // 5. Formatting Dates and Times
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        String formattedDate = today.format(formatter);
	        System.out.println("\nFormatted date: " + formattedDate);

	        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        String formattedTime = nowTime.format(timeFormatter);
	        System.out.println("Formatted time: " + formattedTime);


	        // 6. Parsing Dates and Times from Strings
	        LocalDate parsedDate = LocalDate.parse("2024-03-15", formatter);
	        System.out.println("\nParsed date: " + parsedDate);

	        // 7. Period and Duration
	        Period periodBetweenDates = Period.between(specificDate, today);
	        long daysBetween = ChronoUnit.DAYS.between(specificDate, today);

	        System.out.println("\nPeriod between dates: " + periodBetweenDates);
	        System.out.println("Days between dates: " + daysBetween);

	        // 8. Time Zones
	        ZonedDateTime nowInLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
	        System.out.println("\nNow in London: " + nowInLondon);

	        // 9. Temporal Adjusters (for more complex date calculations)
	        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
	        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

	        System.out.println("\nFirst day of month: " + firstDayOfMonth);
	        System.out.println("Last day of year: " + lastDayOfYear);
	        System.out.println("Next Monday: " + nextMonday);

	        // 10. Working with Locales (for localized formatting)
	        DateTimeFormatter localizedFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.US);
	        String localizedDate = today.format(localizedFormatter);
	        System.out.println("\nLocalized date (US): " + localizedDate);

	        DateTimeFormatter localizedFormatterFR = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.FRANCE);
	        String localizedDateFR = today.format(localizedFormatterFR);
	        System.out.println("Localized date (FR): " + localizedDateFR);

	    }
	}

