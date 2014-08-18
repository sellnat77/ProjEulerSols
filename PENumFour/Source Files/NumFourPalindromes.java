/**
 * Solution to PrujectEuler.net number four to find the largest prime number 
 * created using two 3 digit numbers multiplied together
 *
 */
public class NumFourPalindromes 
{
	public static void main(String Args[])
	{
		PalindromeChecker test = new PalindromeChecker();
		
		test.performThreesProducts();
		test.printLargest();
	}

}
