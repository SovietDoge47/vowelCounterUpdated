package vowelCounterUpdated;

import java.util.Scanner;

public class vowelCounterUpdated {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a book of the New Testament: ");
		
		String word = keyboard.nextLine();
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			for (int x = 0; x < vowels.length(); x++)
			{
				if (word.charAt(i) == vowels.charAt(x))
				{
					vowelCount++;
				}
			}
		}
		System.out.println("There are " + vowelCount + " vowel(s) in " + word);
	}
}

