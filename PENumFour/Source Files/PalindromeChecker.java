import java.util.ArrayList;
import java.util.Collections;

public class PalindromeChecker 
{
	ArrayList<Integer> palNumbers = new ArrayList<Integer>();
	String numToCheck;
	void showThreesProducts()
	{
		int numOne,numTwo,product;
		
		for(numOne = 100; numOne < 1000; numOne++)
		{
			for(numTwo = 100; numTwo < 1000; numTwo++)
			{
				product = numOne*numTwo;
			
				checkPal(product);
			}
		}
	}

	
	void checkPal(int numberToCheck)
	{
		int buffer = numberToCheck;
		int reverse = 0;
		
		while(buffer != 0)
		{
			reverse = reverse * 10; 
			reverse = reverse + buffer %10;
			buffer = buffer / 10;
		}		
		
		if(numberToCheck == reverse)
		{
			palNumbers.add(reverse);
			System.out.println(reverse + " Congratulations!");
		}
	}
	
	void printLargest()
	{
		Collections.sort(palNumbers);
		System.out.println("largest is" + palNumbers.get(palNumbers.size()-1));
	}
}
