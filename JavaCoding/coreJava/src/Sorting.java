import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("s");
		list.add("e");
		list.add("c");
		list.add("a");
		
		for(String value: list) {
			System.out.println("values"+value);
		}
		Collections.sort(list);
		
		for(String value: list) {
			System.out.println("values2222"+value);
		}
		
		//To create unmodifiable list
		
		list = Collections.unmodifiableList(list);
		list.add("b");
		for(String value: list) {
			System.out.println("values22223333"+value);
		}
	}

}
