package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//Declaration
		HashMap<String,Integer> mymap = new HashMap<String,Integer>();

		mymap.put("Himanshu", 101);
		mymap.put("Pannu", 102);
		mymap.put("Heeru", 103);
		mymap.put("Cheeru", 101);

		System.out.println(mymap);

		System.out.println(mymap.size());

		mymap.remove("Pannu");
		System.out.println(mymap);

		System.out.println(mymap.get("Heeru"));
		System.out.println(mymap.keySet());

		mymap.clear();
		System.out.println(mymap);
	}
}
