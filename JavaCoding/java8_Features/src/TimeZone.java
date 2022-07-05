import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

public class TimeZone {

	public static void main(String[] args) {

		Set<String> zoneId = ZoneId.getAvailableZoneIds();
		for (String values : zoneId) {
			System.out.println("values::::::::::::::::::" + values);
		}
		LocalDateTime date = LocalDateTime.now();
		System.out.println("date::::::::::::::::::" + date);
		ZoneId zone = ZoneId.of("Australia/Tasmania");
		ZonedDateTime zoneDateTime = ZonedDateTime.of(date, zone);
		System.out.println("zoneDateTime::::::::::::::::::" + zoneDateTime);

		String date1 = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println("date::::::::::::::::::::" + date1);
		date1 = date.format(DateTimeFormatter.ofPattern(date1, Locale.GERMAN));
		System.out.println("date::::::::::::::::::::" + date1);

	}

}
