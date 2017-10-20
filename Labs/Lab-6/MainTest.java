
public class MainTest {
//main method
	public static void main(String[] args) {
		//initialize array of 5 length and type double
		double[] values = new double[5];
		// assign values to each of the indices
		values[0] = 10;
		values[1] = 5;
		values[2] = 7;
		values[3] = 200.3;
		values[4] = 110.2;
		
		//declare max as a double and set it equal to the maximum value returned by the findMaximum method from the MyMethods class
		double max = MyMethods.findMaximum(values);
		System.out.println(max);
	}

}
