import java.io.FileNotFoundException;

public interface Salary 
{
	public float calculateSalary(int num) throws FileNotFoundException;
	public float calculateBonus() throws FileNotFoundException;
}