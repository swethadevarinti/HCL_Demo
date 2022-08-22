import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IGInfo {

	public static void main(String[] args) {
		// find the number of occurrences from the String

		String word = "swetha";
		char search = 'a';
		int count = 0;
		for(int i= 0;i<word.length();i++) {
			if(word.charAt(i)== search) {	
				count++;
			}
		}
		System.out.println("count::::::::::::::::::::::::"+count);

		// find the number from the list which starts with 1

		List<Integer>  list = Arrays.asList(1,5,10,15,20,25);

		List<String> list1 = list.stream().map(n->n+"").filter(n->n.startsWith("1")).collect(Collectors.toList());

		list1.forEach(System.out::println);
		//  find the max number from the list
		int max = 	list.stream().mapToInt(x->x).max().getAsInt();
		System.out.println("max::::::::::::::::::::::"+max);
		//find min value from the list 
		int min = 	list.stream().mapToInt(x->x).min().getAsInt();
		System.out.println("min::::::::::::::::::::::"+min);
		int sum = list.stream().mapToInt(x->x).sum();

		// To get thired saturday of every month
		
		
		int year = 2022;
		int month = 05;
		YearMonth  ym = YearMonth.of(year, month);
		LocalDate date = ym.atDay(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SATURDAY));
		System.out.println("date:::::::::::::"+date);
		
		//
		
		
		
		
	}

}
