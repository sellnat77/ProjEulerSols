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
