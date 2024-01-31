package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		int startAmount = in.nextInt();
		System.out.println("What is you win limit?");
		int winLimit = in.nextInt();
		System.out.println("What is your win chance, 0 to 1?");
		double winChance = in.nextDouble();
		System.out.println("When are you ruined?");
		int ruin = in.nextInt();
		System.out.println("How many times are you going to the casino?");
		int totalSims = in.nextInt();
		for  (int i = 0; i < totalSims; i++)
		{ 
			int counter = 0;
				while (startAmount < winLimit && startAmount > ruin)
		
				{
					double random = Math.random();
					boolean winLose = (random <= winChance);
					if (winLose == true)
					{
						startAmount++;

					}
					else {
						winLose = false;
						startAmount--;
	
					}
					counter++;
				
				}
			if (startAmount == ruin)
			{
			System.out.println("It is day " + i + "." + " Plays " + counter + ": Ruined" );
			}
			else {
				System.out.println ("It is day " + i + "." + " Plays " + counter + ": Winner");
			}

	}

}
}
