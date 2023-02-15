package studio2;

import java.util.Scanner;

public class Nim {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the initial number of sticks?");
		int sticks = in.nextInt();
		int totalNow = sticks;
		int round = 0;
		while (sticks > 0)
		{
			System.out.println("How many sticks do you want to remove?");
			int RemovedSticks = in.nextInt();
			while (RemovedSticks < 1 || RemovedSticks > 2 || RemovedSticks > sticks)
			{
				System.out.println("Enter valid number of sticks");
				System.out.println("How many sticks do you want to remove?");
				RemovedSticks = in.nextInt();
			}

			round++;
			if (RemovedSticks == 2)
			{
				sticks -=2;
				System.out.println("Round" + round + ": human takes " + RemovedSticks + ", so " + sticks + " remain");
			}
			if (RemovedSticks == 1)
			{
				sticks--;
				System.out.println("Round" + round + ": human takes " + RemovedSticks + ", so " + sticks + " remain");
			}
			if (sticks !=0) {

				round++;
				int computerTakes = (int) Math.round(Math.random() + 1);
				if (sticks == 1){
					computerTakes = 1;
				}
				sticks -=computerTakes;
				System.out.println("Round" + round + ": computer takes " + computerTakes + ", so " + sticks + " remain");
			} 
		}
		if (round % 2 == 1) {
			System.out.println("the human wins");
		}
		else {
			System.out.println("the computer wins");
		}


	}


}


