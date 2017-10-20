/*
 limit = 1000
 num = 1
 previous = 0
 result = 0
 
 while(num < limit)
	print num //print fibonacci number
	result = num + previous //set result to be the current num plus the previous number
	previous = num // set previous to be the current number before updating it
	num = result // update the current number to be (current + previous)
	
 */



public class Fibonacci {

	public static void main(String[] args) {
		int limit = 1000;
		int num = 1;
		int previous = 0;
		int result = 0;
		
		while(num < limit)
		{
			System.out.println(num);
			result = num + previous;
			previous = num;
			num = result;
		}

	}

}
