package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Homogeneous Declaration of Array List
		ArrayList<Integer> mylist1 = new ArrayList<Integer>();
		mylist1.add(10);
		mylist1.add(20);
		mylist1.add(50);
		
		//Heterogeneous Declaration of Array List
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add(3.14);
		mylist2.add('X');
		mylist2.add("Welcome");
		mylist2.add(true);
		mylist2.add(null);

		//Size of ArrayList
		System.out.println(mylist2.size());
		//elements of ArrayList
		System.out.println(mylist2);
		//Removing elements from ArrayList
		mylist2.remove(5);
		System.out.println(mylist2);
		//Insert new elements in middle of list
		mylist2.add(2,"Added Element");
		System.out.println(mylist2);
		//Clear all elements of array list
		mylist2.clear();
		System.out.println(mylist2);
	}
}
