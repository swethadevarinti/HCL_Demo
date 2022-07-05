import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. Counting Empty String

			List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
			long count = strList.stream().filter(x -> x.isEmpty()).count();
			System.out.println("count-----------"+count);
		
		//2. Count String whose length is more than three

			long num = strList.stream().filter(x -> x.length()> 3).count();
			System.out.println("num-----------"+num);
		
		//3. Count number of String which starts with "a"

			long count1 = strList.stream().filter(x -> x.startsWith("a")).count();
			System.out.println("count1-----------"+count1);

		//4. Remove all empty Strings from List
		
			List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
			System.out.println("filtered-----------"+filtered);
			
		//5. Create a List with String more than 2 characters

			List<String> filtered1 = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
			System.out.println("filtered1-----------"+filtered1);

		//6. Convert String to uppercase and Join them with coma

			List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany","italy", "U.K.","canada"); 
			G7 = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
			System.out.println("G7Countries-----------"+G7);
			
			String G8Countries = G7.stream().map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(", "));
			System.out.println("G7Countries-----------"+G8Countries);

		//7. Create a List of the square of all distinct numbers

			List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
			List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
			System.out.println("distinct-----------"+distinct);

		//8. Get count, min, max, sum, and the average for numbers

			List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,29); 
			IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
			System.out.println("stats-----------"+stats);
			
		//9 find max value from list
			
			int max = 	primes.stream().mapToInt(x->x).distinct().skip(1).max().getAsInt();
			System.out.println("max-----------"+max);

		
			int min = 	primes.stream().mapToInt(x->x).min().getAsInt();//to get Integer Stream
			System.out.println("min-----------"+min);
			
			
			
			
			
			
			
	}

}
