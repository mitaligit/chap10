import java.util.Scanner;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type word");
		String word = console.nextLine();
		printPalindrome(word);
	}
	public static void printPalindrome(String word)
	{
		for(int i=0; i<= (word.length())/2; i++)
		{
			if (word.charAt(i)== word.charAt(word.length() - (i + 1)))
			{
				
			}
			else
			{
				System.out.println("no palindrome");
				return;
			}
			
		}
		System.out.println("palindrome");
	}
}
