import java.util.ArrayList;
import java.util.Collections;

public class PalindromeChecker 
{
	ArrayList<Integer> palNumbers = new ArrayList<Integer>();
	String numToCheck;
	
	//Multiplies all numbers between 100-999
	void performThreesProducts()
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

	//Checks if numbers are palindromes
	void checkPal(int numberToCheck)
	{
		int buffer = numberToCheck;
		int reverse = 0;
		
		//repeatedly divides the input by 10 and uses the remainder to assign to
		//the reverse of the input
		while(buffer != 0)
		{
			reverse = reverse * 10; 
			reverse = reverse + buffer %10;
			buffer = buffer / 10;
		}		
		
		if(numberToCheck == reverse)
		{
			palNumbers.add(reverse);
		}
	}
	
	void printLargest()
	{
		Collections.sort(palNumbers);
		System.out.println("largest is " + palNumbers.get(palNumbers.size()-1));
	}
}
