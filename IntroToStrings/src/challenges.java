import java.util.Scanner;
public class challenges
	{

		public static void main(String[] args)
			{
				//challengeOne();
				//challengeTwo();
				challengeThree();

			}
		
		public static void challengeOne()
		{
			Scanner shoutingWords = new Scanner(System.in);
			System.out.println("Please shout something using ALL CAPS!");
			String shouting = new String (shoutingWords.nextLine());
			String upper = new String (shouting.substring(0, 1));
			System.out.println(upper.toUpperCase() + shouting.substring(1).toLowerCase());
			
		}

		public static void challengeTwo()
		{
			System.out.println("Please type something");
			Scanner userInput = new Scanner(System.in);
			String input = userInput.nextLine();
			for (int i = 0; i < input.length(); i++)
			{
				System.out.println(input.substring(i, i + 1));
			}
			
			
		}
		
		public static void challengeThree()
			{

				Scanner userSentence = new Scanner(System.in);
				System.out.println("Please type a sentence.");
				String sentence = userSentence.nextLine();

				int counter = 0;
				for (int i = 0; i < sentence.length(); i++)
					{
						sentence.substring(i, i + 1);
						switch (sentence.substring(i, i + 1))
							{
							case "a":
							case "A":
							case "e":
							case "E":
							case "i":
							case "I":
							case "o":
							case "O":
							case "u":
							case "U":
								{
									counter++;
								}
							}
					}
				System.out.println("This sentence has " + counter + " vowels.");
			}
	}
