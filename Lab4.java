//Carter T Threatt
import java.util.Scanner;
public class Lab4 {

	public static final int MAX=4;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of books purchased at BN booksellers this month: ");
		int books = key.nextInt();
		//Collect and store the number of books purchased by the user. 
		
		int points=0;
		// define the points var for the switch to assign 
		
		if (books<0) {
			System.out.println("Error. Invalid Entry.");
			System.exit(0);
		//Data validation
		}
	
		
		switch(books)
		{
			case 0:
				points=0;
				break;
			
			case 1:
				points=5;
				break;
				
			case 2:
				points=15;
				break;
			case 3:
				points=30;
				break;
			default:
				points=60;
				break;

	}
		// ^^Assign points based on number of books purchased
		
		if (points == 0) {
			System.out.println("You have not earned any points yet. Make a phurchase to start earning points!");
		}
		// Display different message for no points. 
		
		else {
			System.out.println("Congradulations!! You have earned " + points + " points! \n Redeem them at your next book purchase.");
		}
		
		// Display message telling the user how many points they have. 
		
}
}