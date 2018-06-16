import java.util.*;
import javafx.util.Pair;

class Implementation
{
	Scanner getn = new Scanner(System.in);
	public int check()
	{
		int num;
		while (true)
		{
			try
			{
				String str = getn.next();
				num = Integer.parseInt(str);
				if (num > 0) break;
				System.out.println("Please enter a positive integer.");
			}
			catch(Exception e)
			{
				System.out.println("Please enter a positive integer.");
			}
		}
		return num;
	}
	public Pair<Integer, Integer> input()
	{
		System.out.println("How many sides the dice should have?");
		int n1 = check();
		System.out.println("How many times do you want to roll the dice?");
		int n2 = check();
		// Pair<x, x> can only be used with objects it doesn't work with primitive data types
		Pair<Integer, Integer> p = new Pair<Integer, Integer>(n1, n2);
		return p;
	}
	public void rollDice(int faces, int rolls)
	{
		Random die = new Random();
		for (int i = 0; i < rolls; i++)
		{
			int x = die.nextInt(faces);
			System.out.println(x+1);
		}
	}
}