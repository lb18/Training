import java.util.*;
import javafx.util.Pair;
public class Dice
{
	public static void main(String args[])
	{
		Implementation obj = new Implementation();
		Pair<Integer, Integer> num = obj.input();
		int faces = num.getKey(), rolls = num.getValue();
		obj.rollDice(faces, rolls);
	}
}