import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String sentence = "The Java is the best programming language in among all programming language";
		sentence = sentence.toLowerCase();
		String[] words = sentence.split("\\s");
		List<String> list = new ArrayList<>(Arrays.asList(words));

		
		for(int i=0;i<list.size();i++) {

			if(list.lastIndexOf(list.get(i)) != i) {
				System.out.println("Duplicate -- using for loop-- :"+list.get(i));
				list.remove(list.lastIndexOf(list.get(i))); 
			}else {
				//System.out.println("Unique words -- using for loop-- :"+list.get(i)); }

			}


			Set<String> items = new HashSet<>();
			Set set =  list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
			set.forEach(System.out::println);

			for(int i=0;i<list.size();i++) {
				if(list.get(i).contains("java")) {
					System.out.println("-----------"+list.get(i));

				}
			}


			/*
			 * System.out.println("----------------------------------"); SortedSet<String>
			 * uniqueWords = new TreeSet<>(Arrays.asList(words));
			 * 
			 * for (String s : uniqueWords)
			 * System.out.println("Unique words -- using Hash set-- :"+s);		
			 */

		}
}
