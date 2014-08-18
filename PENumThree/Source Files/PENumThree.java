/******************************************************************************
 * Solution to problem three of ProjectEuler.net                              *
 * This solution uses Long to take care of the big data issue                 *
 * two methods are used, one to find all the prime factors                    *
 * of the large number and one to find the largest of the set                 *
 *****************************************************************************/
public class PENumThree 
{
	public static void main(String args[])
	{
		LargePrimeFinder test = new LargePrimeFinder();
		
		Long prime = new Long(600851475143L);
		
		test.primeFactors(prime);
		
		test.printLastPrime();		
	}
}
