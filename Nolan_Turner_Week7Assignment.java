//Nolan Chandler Turner
package week7;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Nolan_Turner_Week7Assignment
{

	public static void main(String[] args)
	{
		int t; //teams
		int g; //games
		int min = 1; // min score
		int max = 99; // max score
		int tot = 0; //team total
		int avg; //team average
		int top; //top score
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		String line = "----------------------------------------------------------";
		
		System.out.println(line);
		System.out.println("Football team randomized season scores");
		System.out.println(line);
		System.out.print("Enter the number of teams: ");
		t = input.nextInt();
		System.out.print("Enter the number of games: ");
		g = input.nextInt();
		System.out.println(line);
		System.out.println("\n\n"+line);
		System.out.println("Football Scores Report");
		System.out.println(line);
		
		System.out.println("Team\tScores\t\t\t\tTot\tAvg");
		System.out.println(line);
		int[][] scores = new int[t][g];
		int[] sorter = new int [t];
		int[] winner = new int[t]; //I will sort the 'sorter' array later and need this one to find the top team
		
		/*
		  This nested for loop is used to fill in the 
		  empty array with random numbers, based on 
		  what the user inputs up above. 
		 */
		for (int i = 0; i<t; i++) 
		{
			for(int j = 0; j< g; j++)
			{
				int num = rand.nextInt((max - min) + 1)+min;
				scores[i][j] = num;
			}
				
		}		
				
		/*
		  This nested for loop is used to print the info
		  from the scores array, and to put those scores 
		  into the specified format. It also adds up the 
		  total score and takes the average of it for 
		  each team. The Average of each team is them 
		  stored in the sorter array as well as the winner
		  array.
		 */
		for (int k = 0; k < t; k++)
		{
			for (int l = 0; l < g; l++)
			{
				if (l==0)
				{
				System.out.print((k+1) +":\t");
				}	
				System.out.printf("%02d ",(scores[k][l]));	
				tot = tot + scores[k][l];
			}
			System.out.print("\t"+tot);
			avg = tot/g;
			sorter[k]=avg;
			winner[k]=avg;
			System.out.print("\t"+avg);
			System.out.println("");
			tot=0;
		}
		System.out.println(line);
		Arrays.sort(sorter); /* sorter is sorted to find the highest score
		 						at the end. the top score is determined and 
		 						given the value 'top'*/
		 
		top = sorter[(t-1)];
		
		
		/*
		  in this loop each score in the unsorted winner
		  array is compared to the highest score, if they 
		  are equal, the team with that score will be printed.
		  if there are 2 teams that tie with the same average 
		  highest score (sort of rare, but I've seen it happen),
		  they will both be printed.
		 */
		for (int z = 0; z < t; z++ )
		{
			int e = winner[z];
			if (e==top)
			{
				System.out.println("Top team : Team "+(z+1));
			}
		}
		System.out.println(line);		
	input.close();
	}
	
}
