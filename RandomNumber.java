import java.util.Scanner;

public class RandomNumber
{

	public static void main(String[] args)
	{
		
	}
	
	public RandomNumber()
	{
		Scanner scan = null;
		try
		{
			System.out.println( "Type the smallest integer you would like." );
			scan = new Scanner( System.in );
			int smallest = scan.next();
			System.out.println( "Now, type the largest integer you would like." );
			scan = new Scanner( System.in );
			int largest = scan.next();
			int random = Math.random() * ( largest - smallest + 1 ) + largest;
			System.out.println( "Your random number is: " + random );
		}
		finally
		{
			if ( scan != null )
			{
				scan.close();
			}
		}
	}

}
