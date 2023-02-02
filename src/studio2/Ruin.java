package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win probability?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many simulations?");
		int totalSimulations = in.nextInt();
		
		double count = startAmount;
		String x = "";
		for (int i = 1; i <= totalSimulations; i++)
		{
		while (count > 0 && count < winLimit)
		{
		double winlose = Math.random();
		if (winlose < winChance)
		{count++;
		System.out.println("you win");
		}
		
		else 
		{count--;
		System.out.println("you lose");
		}
		}
		if (count == winLimit);
		{ x = "success";
		}
		if (count == 0)
		{ x = "ruin";
		}
		
		System.out.println(x);
		}
	}

}
