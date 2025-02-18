// subclass
public class Sister extends Family
	{
		private String food;
		public void prepareDinner(String f)
			{
				food = f;
				System.out.println("I want to try to make " + food + ".");
			}
		public void askForHomeworkHelp()
			{
				System.out.println("Chi, help me NOW.");
			}
	}
