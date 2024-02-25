package arrays;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		//Approach-1

		//Declaration of array
		int arr1[] = new int [5];

		//Inserting data in array
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

		//Approach-2

		//Declaration and Assignment of data in array
		int arr2[] = {1,2,3,4,5,6,7};

		//Size or length of array
		int lengthOfArr1 = arr1.length;
		System.out.println("Length of first array : " + lengthOfArr1);
		int lengthOfArr2 = arr2.length;
		System.out.println("Length of second array : " + lengthOfArr2);

		System.out.println();

		//Get a single value from array
		int fourthElementArr1 = arr1[3];
		System.out.println("4th element of first array : " + fourthElementArr1);
		int fourthElementArr2 = arr2[5];
		System.out.println("5th element of second array : " + fourthElementArr2);
		System.out.println();

		//Get all values from array using "toString" call
		System.out.println("Elements of first array : "  + Arrays.toString(arr1));
		System.out.println("Elements of second array : "  + Arrays.toString(arr2));
		System.out.println();

		//Get all values from array using for loop
		for(int i=0; i<lengthOfArr1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		//Get all values from array using enhanced for loop
		for(int array : arr2) {
			System.out.print(array + " ");
		}
	}
}
