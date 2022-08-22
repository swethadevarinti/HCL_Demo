import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	int rolNo;
	public int getRolNo() {
		return rolNo;
	}
	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	String name;
	String dep;
	Employee(int rolNo,String name,String dep){
		this.rolNo=rolNo;
		this.name=name;
		this.dep=dep;
	}
	
	public String toString() {
		return dep;
		
	}
}
public class FindEmpBsedOnDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(100,"Harshad","CS"));
		emplist.add(new Employee(101,"Karishma","ES"));
		emplist.add(new Employee(102,"Deepa K","CS"));
		emplist.add(new Employee(103,"Sagar","EC"));
		emplist.add(new Employee(104,"Harshad","Mech"));
		emplist.add(new Employee(105,"Amit","CS"));
		emplist.add(new Employee(106,"Himanshu","CS"));
		
		Map<String, Long> list = emplist.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		
		List list1 = emplist.stream().filter(s -> s.getName().equals("Harshad")).collect(Collectors.toList());
		System.out.println(list1.get(1).toString());
		
		//System.out.println("num    :"+num);
		System.out.println("list       :"+list);
		
		
		// SELECT emp_dept, COUNT(*) FROM emp_details GROUP BY emp_dept;
		
		

	}

}
