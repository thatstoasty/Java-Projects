import java.util.Arrays;

public class Assignment {
	//for each element i in row, print the element followed by a tab. When complete, break to next line.
    public static void printRow(float[] row)
    {
        for (float i : row) {
            System.out.print(i); 
            System.out.print("\t");
        }
        System.out.println();
    }
    
	public static void main(String[] args)
	{
		//declare variables
		final int ASSIGNMENTS = 11; //10 assignments plus 1 for Student ID
		final int STUDENTS = 21; //20 students plus 1 for Assignment number
		
		//declare gradebook 2D array, students x assignments dimensions
		float[][] gradebook = new float[STUDENTS][ASSIGNMENTS]; 
		
		//increment through the first column and assign student IDs, in this case it's i
		for(int i=0; i < STUDENTS; i++)
		{
				gradebook[i][0] = i;
		}
		
		//increment through the first row and fill assignment numbers
		for(int j=1; j < ASSIGNMENTS; j++)
		{
			gradebook[0][j] = j;
		}
		
		//for every entry thats not a student id or assignment number, fill in a grade of 10.
		for(int i=1; i < STUDENTS; i++)
		{
			for(int j=1; j < ASSIGNMENTS; j++)
			{
				gradebook[i][j] = 10;
			}
		}
		
		//add 0.5 to each student's assignment 7, 0.5 needs to be cast to float as it defaults to double
		for(int i=1; i < STUDENTS; i++)
		{
			gradebook[i][7] = (gradebook[i][7]) + (float)0.5;
		}
		
		//print each row in the gradebook 2d array
		for(float[] row : gradebook) 
		{
	        printRow(row);
	    }
	}
}
