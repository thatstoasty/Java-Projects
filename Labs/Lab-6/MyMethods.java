
public class MyMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double findMaximum(double[] numbers)
	{
		//initialize the variable that will hold the max
		double arr_max = 0;
		//foreach loop that increments through each element in the array of type double that's passed to the method
		for(double element: numbers)
		{
			//if the element is greater than the currently saved max, overwrite the max with the element. Otherwise do nothing
			if(element > arr_max)
			{
				arr_max = element;
			}
		}
		//return max
		return arr_max;
	}

}
