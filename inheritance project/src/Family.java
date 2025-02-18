// superclass
public class Family
	{
		private String food;
		public void prepareDinner(String f)
			{
				food = f;
				System.out.println("Chi, make the " + food + ".");
			}
		public void buyGroceries()
			{
				System.out.println("Can we get snacks?");
			}
	}
