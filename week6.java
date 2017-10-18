import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class week6 {

	public static void main(String[] args) {
		

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int userChoice, computerChoice;
		
		int[] aryNums;
		aryNums = new int[5];
		
		
		
		int rounds = 0;
		int computerodd = 0;
		int computereven = 0;
		int victorys = 0;
		int failures = 0;
		
		
		
		
		while (true) {
			
			
			aryNums[0] = rounds;
			aryNums[1] = computerodd;
			aryNums[2] = computereven;
			aryNums[3] = victorys;
			aryNums[4] = failures;
			
			Arrays.sort(aryNums);
			
			int i;
			
			
			
		
		System.out.println("A six sided dice has rollled. Guess if it rolled an odd (type 1) or even (type 0) number.");
		userChoice = scanner.nextInt();
		
		rounds++;
		
		computerChoice = random.nextInt(6) + 1;
		if (computerChoice % 2 == 0 ) 
		{
			computerChoice = 0;
			
			computereven++;
			
		}
		else {
			computerChoice = 1;
			
			computerodd++;
			
		}
		if(userChoice == computerChoice)
		{
			if(userChoice == 0)
			{
				System.out.println("Your even guess was CORRECT!");
				
				victorys++;
				
			}
			else {
				System.out.println("Your odd guess was CORRECT!");
				
				victorys++;
				
			}
		}
		if(userChoice != computerChoice)
		{
			if(userChoice == 0)
			{
				System.out.println("Your even guess was WRONG!");
				
				failures++;
				
			}
			else {
				System.out.println("Your odd guess was WRONG!");
				
				failures++;
				
			}
		}
		
		System.out.println("That was round: " + rounds);
		
		System.out.println("the number of times the COMP chose even is: " + computereven);
		
		System.out.println("the number of times the COMP chose odd is: " + computerodd);
		
		double winpercent = victorys *100 / failures ;
		
		System.out.println("Win Percentage: " + winpercent);

		
		System.out.println("Do you want to play again? (1:Yes/2:No)");
		 if (scanner.nextInt() != 1) break;
		 for (i = 0; i < aryNums.length; i++) {
			 System.out.println("num:" + aryNums[i]);
		 }
		}
		
	}
	
}
		
// please see if you can avoid while (true)
