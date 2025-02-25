// superclass
public abstract class Family
	{
		protected String food; // instance variable

		public void prepareDinner(String f) // overridden method
			{
				food = f;
				System.out.println("Prepare the " + food + ".");
			}

		public void buyGroceries() // method
			{
				System.out.println("Can we get snacks?");
			}

		public abstract void sleepLate(); // abstract method
	}
