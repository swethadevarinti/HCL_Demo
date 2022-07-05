import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		//al.add(0);
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(4);
		al.add(8);
		al.add(2);
		al.add(8);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("al::::::::::::"+al);
		
		List l7 = al.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("al::::::::::::"+l7);
		
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					al.remove(i);
				}
			}
		}
		
		ArrayList al2 = new ArrayList();
		for(int i=al.size()-1;i>=0;i--) {
			al2.add(al.get(i));
		}
		
		System.out.println("al2::::::::::::"+al2);
		
		Collections.reverse(al2);
		System.out.println("al2::::::::::::"+al2);
		
		//filter
	List<Integer>	l2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());//.forEach(System.out::println());
	System.out.println("i::::::1111111111111111::::::::::"+l2);
	
	 boolean flag = al.stream().anyMatch(i->i%2==0);
	System.out.println("flag::::::::::::"+flag);
	
	//Map
	List<Integer>	l3 = al.stream().map(i->i*i).distinct().collect(Collectors.toList());//.forEach(System.out::println());
	System.out.println("i:111111111111::::::::::::"+l3);
	
	al.stream().map(i->i*i).distinct().forEach(i -> System.out.println("//////////////////"+i));
	
	//sorting
	List<Integer>	l4 = al.stream().sorted((i1,i2)->i2.compareTo(i1)).distinct().collect(Collectors.toList());
	System.out.println("i:111111111111::::::::::::"+l4);
	
	
	 al.stream().map(i->i*i).peek(System.out::println).forEach(System.out::println);
	
	
	
	}
}
