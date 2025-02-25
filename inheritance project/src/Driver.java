// driver class
public class Driver
	{
		public static void main(String[] args)
			{

				Family s = new Sister(); // polymorphic instantiation
				
				s.buyGroceries();
				s.prepareDinner("fried rice"); // calls two methods
				((Sister) s).askForHomeworkHelp(); // casting
				s.sleepLate();

			}

	}
