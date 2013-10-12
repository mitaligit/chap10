import java.util.Scanner;


public class countusingsplit {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type string");
		String word = console.nextLine();
		wordCount(word);
	}
	public static void wordCount(String word)
	{
		String[] sp = word.split(" ");
		int count = sp.length;
		System.out.println(count);
	}
}
