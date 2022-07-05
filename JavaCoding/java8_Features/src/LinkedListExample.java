import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {


	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll)
	{

		for (int i = ll.size() - 1; i >= 0; i--) {

			ll.add(ll.get(i));
		}

		return ll;
	}

	public static void main(String[] args) {
		LinkedList<Integer> mylist = new LinkedList<>();

		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(5);
		mylist.add(89);
		mylist.add(20);
		mylist.add(67);
		mylist.add(55);
		Collections.sort(mylist);
		
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(mylist.size()-1));
		
		
		/*
		 * System.out.println("Original List : " + mylist); //in-built method
		 * //Collections.reverse(mylist); System.out.println("Modified List: " +
		 * mylist);
		 * 
		 * // mylist = reverseLinkedList(mylist);
		 * 
		 * System.out.println("Modified List: " + mylist);
		 * 
		 * //using java 8 List arrayList = new ArrayList<>();
		 * mylist.stream().collect(Collectors.toCollection(LinkedList ::
		 * new)).descendingIterator().forEachRemaining(arrayList :: add);
		 * System.out.println("After reversing..."); System.out.println(arrayList);
		 */		 
	}

}


