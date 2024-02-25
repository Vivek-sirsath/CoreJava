package collections;

import java.util.HashSet;

public class HashSetDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Homogeneous Declaration of Array List
		HashSet<Integer> myset1 = new HashSet<Integer>();
		myset1.add(10);
		myset1.add(20);
		myset1.add(50);
		
		//Heterogeneous Declaration of Array List
		HashSet myset2 = new HashSet();
		myset2.add(100);
		myset2.add(3.14);
		myset2.add('X');
		myset2.add("Welcome");
		myset2.add(null);

		System.out.println(myset2);

		////Size of HashSet
		System.out.println(myset2.size());

		//Removing elements from HashSet
		myset2.remove(100);
		System.out.println(myset2);

		//Clear all elements of HashSet
		myset2.clear();
		System.out.println(myset2);
	}
}
