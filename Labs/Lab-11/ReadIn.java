import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIn {

	public static void main(String[] args) throws FileNotFoundException {
		//read in filename
		System.out.print("Enter a filename: ");
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		
		//open that file using a file object
		File inputFile = new File(fileName);
		in = new Scanner(inputFile);
		
		//declare an integer array to read the numbers from that file
		int myNumbers[] = new int[10];
		int i = 0;
		
		//loop that reads a set of numbers and stores in an array
		while (in.hasNextInt())
		{
			int num = in.nextInt();
			myNumbers[i] = num;
			i++;
		}
		in.close();
		System.out.println(myNumbers[2]);
		//pass the int array to the FindMax static method and print the max
		int max = MyMath.FindMax(myNumbers);
		System.out.println(max);
	}

}
