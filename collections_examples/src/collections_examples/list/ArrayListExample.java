package collections_examples.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		
		List<String> names = new ArrayList<>();


		numbers.add(1);
		numbers.add(2);

		
		names.add("Anthony");
		names.add("Sampath");
		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
			names.add(i+"Anthony");
		}

		System.out.println(numbers);
		System.out.println(names);

	}

}
