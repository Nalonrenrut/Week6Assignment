//Nolan Chandler Turner
package week6;
import java.util.Scanner;
import java.util.Random;
public class Nolan_Turner_Week6Assignment
{

	public static void main(String[] args) 
	{
		
		averageOfRandNumbers();
		averageOfUserNumbers();
		displayMenu();
		
	}

	//Part 1 start-----------------------------------------------------------------------
	private static void averageOfRandNumbers() 
	{

		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int min;
		int max;
		int range;
		int sum = 0;
		
		
		System.out.println("---------------------------------------------------------------------\n" + 
				"Part 1: for loop: Average of randomly generated integers\n" + 
				"---------------------------------------------------------------------");
		System.out.print("Enter the bottom number of the range: ");
		min = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		max = input.nextInt();
		System.out.print("Enter how many numbers to generate: ");
		range = input.nextInt();
		System.out.print("Generated random numbers: ");
			
		for (int i = 1; i <= range; i++ )
			{
				int num = rand.nextInt((max - min) + 1)+min;
				System.out.print(num +" ");
				sum = sum + num;
			}
		
		System.out.print("\nAverage of generated numbers: "+ sum/range);
		System.out.println("\n---------------------------------------------------------------------");

			//input.close();
			
	}

	//Part 2 Start-----------------------------------------------------------------------

	private static void averageOfUserNumbers()
	{
		Scanner input = new Scanner(System.in);
		int entry;
		int counter = 1;
		int sum = 0;
		System.out.println("Part 2: while loop: Average of user-entered integers using While loop"+
				"\n---------------------------------------------------------------------");	
		System.out.println("Enter integers to average. Enter -1 to finish.");
		System.out.print("Entry 1: ");
		entry = input.nextInt();
			
		while (entry !=-1)
			{
			sum = entry+sum;
			counter++;
			System.out.print("Entry "+counter+": ");
			entry = input.nextInt();
			}
		counter--;
		System.out.println("Number of enteries: " +counter);
		if (counter>0)
		{
			System.out.println("Average of user-entered numbers: " +sum/counter);
		}
		System.out.println("---------------------------------------------------------------------");

		
		//input.close();
	}
	
	//Part 3 Start-----------------------------------------------------------------------

	private static void displayMenu() 
	{
		Scanner input = new Scanner(System.in);
		int choice=1;
		System.out.println("Part 3: do-while loop: Display menu until user chooses to exit\n"+
		"---------------------------------------------------------------------\n");
		
		do
		{
			
				
			
		System.out.println("==============================\n" + 
				"MENU\n" + 
				"==============================");
		System.out.println("1: Choice 1\n" + 
				"2: Choice 2\n" + 
				"3: Choice 3\n" + 
				"4: Exit");
		System.out.println("==============================");
		System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
		choice = input.nextInt();
		if (choice <1 || choice >4)
		{
			System.out.print("ERROR: Please enter a valid choice (1, 2, 3 or 4)\n\n");
		}
			
			
		}while (choice != 4);
		System.out.print("Goodbye!");
		input.close();
	}
	
	
}
