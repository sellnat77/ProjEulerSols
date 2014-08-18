
public class PrimeFinder 
{
	boolean isPrime(int numToAnalyze)
	{
		int k;
		boolean isPrime = true;
	
		if(numToAnalyze == 4)
		{
			isPrime = false;
		}
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
	
	void primeCounter()
	{
		int k,count;
		count = 0;
		k = 2;
		
		while(count != 10002)
		{
			if(isPrime(k))
			{
				count++;
				//System.out.println("testing number " + count+ "..." + k);
				
				
			}
			if(isPrime(k) && count == 10001)
			{
				System.out.println("Found it! " + k);
				break;
			}
			k++;
		}
	}
}
