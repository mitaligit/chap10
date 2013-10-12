import java.util.Scanner;
public class count {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type string");
		String word = console.nextLine();
		wordCount(word);
	}
	public static void wordCount(String word)
	{
		int count =0;
		//char[] tmp = word.toCharArray();
		boolean wordEnd = true;
		for(int i=0; i<=word.length()-1; i++)
		{
			if (Character.isLetterOrDigit(word.charAt(i)))
			{
				if (wordEnd)
					count++;
				wordEnd = false;
			}
			if( word.charAt(i) == ' ') {
				wordEnd = true;
			}
		}
		System.out.println(count);
	}
}
