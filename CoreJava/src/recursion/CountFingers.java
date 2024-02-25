
/*
 Imagine you have a task to count the fingers on your hand. 
 Recursion in this case would be like counting one finger at a time and then 
 deciding to count the remaining fingers in the same way until there are no more fingers left. 
 
 Here's what's happening:

1. We have a method called countFingers that takes an integer finger representing the finger number.
2. If finger is 0, we print "No more fingers left!" and stop. This is the base case.
3. If finger is not 0, we print "Counting finger number finger" and then call countFingers with finger - 1. This is the recursive part.
4. In the main method, we start counting fingers by calling countFingers(5) assuming you have 5 fingers on each hand.
  
 */

package recursion;

public class CountFingers {

	// A method to count fingers
	public static void countFingers(int finger) {

		// Base case: If there are no more fingers left, stop counting
		if (finger == 0) {
			System.out.println("No more fingers left!");
		}
		// Otherwise, count one finger and recursively count the remaining fingers
		else {
			System.out.println("Counting finger number " + finger);
			countFingers(finger - 1); // Recursion here // Calling the method itself with one less finger
		}
	}

	public static void main(String[] args) {
		countFingers(5); // Start counting fingers, assuming you have 5 fingers on each hand
	}
}
