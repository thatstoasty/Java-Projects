import java.util.Scanner;
public class MyMath 
{
	
	// Function for Fibonacci series
	public static int Fibonacci(int x)
	{
		// Initialize
		int prev1=1;
		int prev2=1;
		int[] result = new int[10]; 
			    			    
		// Print the rest of the values as long as they are in the given range.
		for (int j=0; j<10; j++)
		{
		  	result[j] = prev1+prev2;
			    	
			// Reassignment of the values
			prev1 = prev2;
			prev2 = result[j];
		}
		return result[x];
	}
	
	// Function for finding the maximum
	public static int FindMax(int[] numbers)
	{
		int max = 0;
		for (int i=0; i<5; i++)
		{
			if (numbers[i] > max)
				max = numbers[i];
		}
//		System.out.println(numbers.length);
		return max;
	}

	public static float FindAvg(int[] numbers)
	{
		int sum = 0;
		for (int p=0; p<numbers.length; p++)
		{
			sum += numbers[p];
		}
		float average = (float)sum/numbers.length;
		return average;
	}
}
