import java.util.ArrayList;
import java.util.Collections;

public class LargePrimeFinder 
{
	private ArrayList <Integer> primes = new ArrayList<Integer>(); 
	
	LargePrimeFinder(){}
	
	boolean isPrime(int numToAnalyze)
	{
		int k;
		boolean isPrime = true;
		
		//Only the numbers between 2 and number/2 are necessary to test for primes
		for( k = 2; k < numToAnalyze/2; k++)
		{
			if(numToAnalyze%k == 0)
			{
				isPrime = false;
			}
		}		
		return isPrime;
	}
	
	void primeFactors(Long prime)
	{
		int k;
		
		for(k = 2; k < prime; k++)
		{
			if(prime%k == 0 && isPrime(k))
			{
				primes.add(k);
			}
			//Needed to stop the program from hitting an exception and crashing
			if(k < 0)
			{
				break;
			}
		}
	}
	
	void printLastPrime()
	{
		Collections.sort(primes);
		System.out.println(primes.get(primes.size()-1));
	}
}
