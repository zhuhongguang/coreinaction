package map;

import java.util.HashMap;
import java.util.Map;

import clone.Employee;

public class MapTest {
public static void main(String[] args) {
	Map<String,Employee> staff=new HashMap<>();
	staff.put("144", new Employee("Amy lee"));
	staff.put("567", new Employee("Harry Hacker"));
	staff.put("157", new Employee("Gary Cooper"));
	staff.put("456", new Employee("Francesca Cruz"));
	//System.out.println(staff);
	staff.remove("567");
	staff.put("456",new Employee("Francesca Miller"));
	//System.out.println(staff.get("157"));
	System.out.println(staff.entrySet().toString());
	for(Map.Entry<String, Employee> entry:staff.entrySet())
	{
//		String key=entry.getKey();
//		Employee value=entry.getValue();
		Employee value1=entry.setValue(new Employee("F C"));
		System.out.println(value1);
	//	System.out.println("key="+key+", value="+value);
		Employee value=entry.getValue();
		System.out.println(value);
	}
}
}
