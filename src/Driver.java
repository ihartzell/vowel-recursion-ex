import java.util.Scanner;
/*
Isaac Hartzell
CIS2207 N02
1-17-18
This program demonstrates recursion for vowels.
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please type a sentence.");
		String sentence = input.nextLine();
		System.out.println("I will now show the count of vowel letters from what you input.");
		System.out.print("Enter 1 to continue: ");
		int option = input.nextInt();
		
		while(option < 1 || option > 1)
		{
			System.out.println(option + " is invalid, please enter 1.");
			option = input.nextInt();
		}
		System.out.print(sentence +" was what was input, Vowel count is: ");
		System.out.print(vowelRecursion(sentence));
	}
	
	public static int vowelRecursion(String sentence)
	{
		int vowelCount = 0;
		// char variable created solely so that I can assign it to the string argument, and create an if statement to the "A,E,I,O,U."
		char tempVar;
		
		//base case, I'm not sure why it seems the program always goes to this case however. If I put a string in there before the return,
		// it'll always print the string indicating this base case always happens.
		if(sentence.length() < 1 )
		{
			return 0;
		}
		else
		{
			// Assigning this variable to the first letter or character inputted.
			tempVar = sentence.charAt(0);
			
			if(tempVar == 'a' || tempVar == 'A' || tempVar == 'e' || tempVar == 'E' || tempVar == 'i' || tempVar == 'I' || tempVar == 'o' || 
			   tempVar == 'O' || tempVar == 'u' || tempVar == 'U')
			{
				vowelCount++;
				 
			}
			// I'm returning the vowelCount as well as calling for this method where all characters past the first character is checked
			// via the substring at index 1, so If I wrote asdf asdf this would check all the characters past the first a.
			return vowelCount + vowelRecursion(sentence.substring(1));	
		}	
	}
}
