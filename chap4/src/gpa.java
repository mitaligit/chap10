import java.util.Scanner;


public class gpa {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("Enter Student name");
		String str1 = console.nextLine();
		Scanner console1 = new Scanner (System.in);
		int number = console1.nextInt();
		printGPA(number);
	}
	public static void printGPA(int number)
	{
		double avg = 0;
		double total = 0;
		for(int i = 1; i<= number; i++)
		{
			Scanner console2 = new Scanner (System.in);
			int number1 = console2.nextInt();
			total = (total + number1);
			avg = (total / number);
			System.out.println(avg);
			
		}
	}
}
