import java.util.Scanner;
public class range {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type first num");
		int first = console.nextInt();
		Scanner console1 = new Scanner (System.in);
		System.out.println("type second num");
		int second = console1.nextInt();
		printRange(first,second);
	}

	public static void printRange(int first, int second)
	{
		
		if (first<second)
		{
			System.out.print("[");
			for (int i = first; i <= second; i++)
			{
				System.out.print(i);
				if(i!=(second))
				{
					System.out.print(",");
					}
			}
			
			System.out.print("]");
		}
		else if(first>second)
		{
			System.out.print("[");
			for (int i = first; i >= second; i--)
			{
				System.out.print(i);
				if(i!=(second))
				{
					System.out.print(",");
					}
			}
			
			System.out.print("]");
			
		}
		else if(first ==second)
		{
		System.out.print(first);	
		}
	}
}
