public class MultipleFinder 
{
	void printSmallest(Long testNum)
	{
		boolean found = true;
		int multiples,smallest;
		
		for(smallest = 1; smallest < testNum; smallest++)
		{
			//If number is not evenly divisible by any number, exit loop and 
			//set found to false
			for(multiples=1; multiples < 20; multiples++)
			{				
				if(smallest%multiples != 0)
				{
					found = false;
					break;
				}
			}
			//If number cleared 1-20 print number and exit outside loop
			if(found)
			{
				System.out.println("Found " + smallest);
				break;
			}
			//Otherwise, reset found
			else
			{
				found = true;
			}			
		}
	}
}
