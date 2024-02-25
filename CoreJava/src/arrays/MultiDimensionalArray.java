package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		//Approach-1

		//Declaration of array
		int arr1[][] = new int [3][2];

		//Inserting data in array
		arr1[0][0] = 100;
		arr1[0][1] = 200;
		arr1[1][0] = 300;
		arr1[1][1] = 400;
		arr1[2][0] = 500;
		arr1[2][1] = 600;

		//Approach-2

		//Declaration and Assignment of data in array
		int arr2[][] = {{1,2},{3,4},{5,6}};

		//Size or length of array
		int rowsOfArr1 = arr1.length;
		System.out.println("Rows of first array : " + rowsOfArr1);
		int colsOfArr1 = arr1[0].length;
		System.out.println("Columns of first array : " + colsOfArr1);
		System.out.println();
		int rowsOfArr2 = arr2.length;
		System.out.println("Rows of second array : " + rowsOfArr2);
		int colsOfArr2 = arr2[0].length;
		System.out.println("columns of second array : " + colsOfArr2);


		System.out.println();

		//Get a single value from array
		int fourthElementArr1 = arr1[1][1];
		System.out.println("Element of first array : " + fourthElementArr1);
		int fourthElementArr2 = arr2[2][0];
		System.out.println("Element of second array : " + fourthElementArr2);
		System.out.println();

		//Get all values from array using for loop
		for(int r=0; r<rowsOfArr1; r++) {
			for(int c=0; c<colsOfArr1; c++) {
				System.out.print(arr1[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();

		//Get all values from array using enhanced for loop
		for(int arr[] : arr2) {
			for(int array :  arr) {
				System.out.print(array + " ");
			}
			System.out.println();
		}

	}
}
