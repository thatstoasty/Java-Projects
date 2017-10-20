/*
 College students are between 18-22 typically, we would like to identify these students.
 
 declare birth year as int
 declare current year as int
 
 declare age as difference of current year and birth year 
 
 if age >= 18
 	if age == 22
 		print "The student is a senior."
 	if age == 21 
 		print "The student is a junior."
 	if age == 20
 		print "The student is a sophomore."
 	if age == 18 || age == 19
 		print "The student is a freshman."
 else
 	"The student is most likely, not in a four year college."
 */


public class InCollege {

	//main method
	public static void main(String[] args) {
		//variable declaration
		int birth_year = 1901;
		int current_year = 2017;
			
		int age = current_year - birth_year;
		 
		if (age >= 18 && age <= 22)
		{
			switch(age) 
			{
			case 22:
			 	System.out.println("This person is a student, and they are a senior.");
			 	break;
			case 21: 
				System.out.println("This person is a student, and they are a junior.");
				break;
			case 20:
				System.out.println("This person is a student, and they are a sophomore.");
				break;
			case 19:
				System.out.println("This person is a student, and they are a freshman.");
				break;
			}
		}
		else
			System.out.println("This person is most likely, not in a four year college.");

	}

}
