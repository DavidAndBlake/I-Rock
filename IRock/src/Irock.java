import javax.swing.JOptionPane;

public class Irock
{
	public static void main(String[] args)
	{
		String singer = JOptionPane
				.showInputDialog("Who is your favorite singer?");
		truth(singer);
	}

	public static void truth(String singer)
	{
		if (singer.equals("Andrea Bocelli") || singer.equals("Frank Sinatra"))
		{
			JOptionPane.showMessageDialog(null, "Oh yeah! " + singer
					+ " is awesome!");
		}
		if (singer.equals("Justin Bieber"))
		{
			JOptionPane.showMessageDialog(null, "',:( Uhh, are you feeling okay?");
		}
	}
}