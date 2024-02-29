
/*
 Imagine you have a task of eating a certain number of cookies. You can eat one cookie at a time. 
 Recursion in this case would be like eating one cookie and then deciding to eat the remaining cookies
 in the same way until there are no more cookies left. 
 
 Here's what's happening:

1. We have a method called eatCookies that takes an integer numCookies.
2. If numCookies is 0, we print "No more cookies left!" and stop. This is the base case.
3. If numCookies is not 0, we print "Eating a cookie..." and then call eatCookies with numCookies - 1. This is the recursive part.
4. In the main method, we start eating 3 cookies by calling eatCookies(3).
  
 */

package recursion;

public class CookieEating {

	// A method to eat cookies
	public static void eatCookies(int numCookies) {
		// Base case: If there are no more cookies left, stop eating
		if (numCookies == 0) {
			System.out.println("No more cookies left!");
		}
		// Otherwise, eat one cookie and recursively eat the remaining cookies
		else {
			System.out.println("Eating a cookie...");
			eatCookies(numCookies - 1); // Calling the method itself with one less cookie
		}
	}

	public static void main(String[] args) {
		eatCookies(3); // Start eating 3 cookies
	}

}
