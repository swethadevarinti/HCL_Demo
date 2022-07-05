import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Set<Integer> result = findDuplicateBySetAdd(list);
        result.forEach(System.out::println);
        
        Map<Integer,Integer> hs = new HashMap<>();
        hs.put(1, 10);
        hs.put(2, 10);
        hs.put(1, 20);
        
        
        Set<Map.Entry<Integer, Integer>> hashSet = hs.entrySet();
        System.out.println("---------: Contacts in my Phone List :----------");
        for (Map.Entry<Integer, Integer> entry : hashSet) {
            System.out.println("Name : " + entry.getKey() + " " + " Number : " + entry.getValue());
        }
        
        
        
        System.out.println("------------------------------------------------");
        System.out.println("No of contacts in myPhoneBook : " + hs.size());
        System.out.println("Vikram's Contact number : " + hs.get(1));

	}
	
	 public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

	        Set<T> items = new HashSet<>();
	        Set set =  list.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
	                .collect(Collectors.toSet());
	        set.forEach(System.out::println);
	        return set;

	    }

}
