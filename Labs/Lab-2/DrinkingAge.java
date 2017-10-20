/* Pseudo-code
 if person's birth year is less than cutoff year (born earlier)
 	print "able to drink"
 else 
 	print "unable to drink"
 */


public class DrinkingAge {

	public static void main(String[] args) {
		int birth_year = 1993;
		int current_year = 2015;
		int difference = (current_year - birth_year);
				
		if (difference >= 21)
			System.out.println("This person is allowed to drink.");
		else
			System.out.println("This person is not allowed to drink.");

	}

}
