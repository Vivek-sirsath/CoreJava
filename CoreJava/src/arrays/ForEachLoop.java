package arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9,10};

		//For each loop to find all the elements of single dimensional array
		System.out.println("Single Dimensional array");
		for(int array : a) {
			System.out.print(array + " ");
		}
		System.out.println();

		int b[][] = {{1,2},{3,4},{5,6}};
		
		//For each loop to find all the elements of multi dimensional array
		System.out.println("Multi Dimensional array");
		for(int arr[] : b) {
			for(int array :  arr) {
				System.out.print(array + " ");
			}
			System.out.println();
		}
	}

}
