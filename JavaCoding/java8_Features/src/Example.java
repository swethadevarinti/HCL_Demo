import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name; 
	int age; 
	int id;
	int marks;
	
	public String getName() {
		return name; 
	} 
	public int getAge() { 
		return age; 
	} 
	public int getId() { 
		return id; 
	}

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	Student(String n, int a, int i,int m){ 
		name = n; 
		age = a; 
		id = i;
		marks = m ;
	} 
	@Override
	public String toString() {     
		return ("Student[ "+"Name:"+this.getName()+             
				" Age: "+ this.getAge() +                     
				" Id: "+ this.getId()+ " Marks: "+ this.getMarks()+ "]"); 
	}
}
public class Example {
	
   public static void main(String[] args) {
	   
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Jon", 22, 1001,450)); 
      studentlist.add(new Student("Steve", 19, 1003,500)); 
      studentlist.add(new Student("Kevin", 23, 1005,452)); 
      studentlist.add(new Student("Ron", 20, 1010,200)); 
      studentlist.add(new Student("Lucy", 18, 1111,200));
      
      
     // studentlist.stream().sorted((Student s1, Student s2)->s2.getMarks() - s1.getMarks()).limit(3).forEach(System.out::println);
     // studentlist.stream().filter(s-> s.getMarks()== 200 && s.getAge()>18).collect(Collectors.toList()).forEach(System.out::println);
      
      studentlist.stream().sorted((Student s1, Student s2)->s1.getName().compareTo(s2.getName())).forEach(System.out::println); 
      
      
      //studentlist.forEach((s)->System.out.println(s));
   //List<Student> list =  studentlist.stream().filter(s1->s1.getName().equals("Lucy")).collect(Collectors.toList());
  // list.forEach(s -> s.getName().toUpperCase());
   // list.forEach(System.out::println);
      
      //studentlist.stream().filter(i -> i.getName().equals("John")).
      
   }
}