package collections_examples.list;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedListExample {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Employee empl2 = new Employee();
		Employee empl1 = new Employee();

		employees.add(empl2);

		for (int i = 1; i <= 10; i++) {
			Employee empl = new Employee();
			empl.setMobile("rdtfyguhijokl" + i);
			empl.setName("Antony" + i);
			employees.add(empl);

		}

		System.out.println(employees);

//		employees.clear();

		System.out.println("Updated List:" + employees);

		System.out.println(employees.contains(empl1));

		for (Employee e : employees) {
			System.out.println(e.getName());
			System.out.println(e.getMobile());
			

		}

	}

}
