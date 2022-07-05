import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class NewDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("date::::::::::::::::::"+date);
		date = LocalDate.of(2015, 05, 20);
		System.out.println("date::::::::::::::::::"+date);
		date = LocalDate.parse("2015-05-21");
		System.out.println("date::::::::::::::::::"+date);
		LocalDate day = LocalDate.now().plusDays(2);
		System.out.println("day::::::::::::::::::"+day);
		date = LocalDate.now().minusMonths(1);
		System.out.println("date::::::::::::::::::"+date);
		
		//To get biginning of day
		LocalDateTime beginnigOfDay = LocalDate.parse("2022-05-17").atStartOfDay();
		System.out.println("beginnigOfDay::::::::::::"+beginnigOfDay);
		
		//To get firstday of month
		LocalDate firstDayOfMonth = LocalDate.parse("2022-05-17").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth::::::::::::"+firstDayOfMonth);
		
		//Last sunday
	 firstDayOfMonth = LocalDate.parse("2022-05-17").with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
	 System.out.println("firstDayOfMonth::::::::::::"+firstDayOfMonth);
	 
	 //To get second sunday
	 firstDayOfMonth = LocalDate.parse("2022-05-17").with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
	 System.out.println("firstDayOfMonth::::::::::::"+firstDayOfMonth);
	 
	}
	

}
