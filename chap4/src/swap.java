import java.util.Scanner;
public class swap {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type string");
		String word = console.nextLine();
		swapPairs(word);
	}
	public static void swapPairs(String word)
	{
		char[] tmp = word.toCharArray();
		for (int i=0; i<tmp.length; i=i+2)
		{
			if ( i >= tmp.length -1) { 
				System.out.println(tmp);
				return;
			}
			char c1 = tmp[i];
			tmp[i] = tmp[i+1];
			tmp[i+1] = c1;
		}
		System.out.println(tmp);
		
	}
}
