
public class AvgValue {

	public static void main(String[] args) {
	}

	public static double return_Avg(double[] numbers) //function that returns the avg value of the elements in the array
	{
		double total = 0;
		for (double element : numbers) //for each element in the array, add the element to the total
		{
			total = total + element;
		}
		double avg = total / numbers.length; //calculate and return the avg.
		return avg;
	}
}
