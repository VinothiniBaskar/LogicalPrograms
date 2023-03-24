package array.programs;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 2, 3 };

		Set<Integer> set = new TreeSet<Integer>();

		for (Integer integer : a) {
			set.add(integer);
		}
		System.out.println(set);
	}

}
