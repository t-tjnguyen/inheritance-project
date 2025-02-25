// subclass
public class Sister extends Family
	{
		protected String food; // instance variable

		public void prepareDinner(String f) // method
			{
				super.prepareDinner("shrimp"); // super that accesses overridden method
				food = f;
				System.out.println("I want to try to make " + food + ".");
			}

		public void askForHomeworkHelp() // method
			{
				System.out.println("Jo, help me NOW.");
			}

		public void sleepLate() // concrete method
			{
				System.out.println("I have a project due at 8 am.");
			}
	}
