import java.util.Scanner;
public class smallarge {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("How many numbers do you want to enter?");
		int number = console.nextInt();
		smallestLargest(number);
	}
	public static void smallestLargest(int number)
	{
		int smallest = -1;
		int largest= -1;
		for(int i=1; i<=number; i++)
		{
		Scanner console1 = new Scanner (System.in);	
		System.out.println("Number "+i+";");
		int number1 = console1.nextInt();
		
		//compare and update smallest and largest
		if (number1 >= largest)
		{
			System.out.println(number1+" is largest");
			largest = number1;
		}
		else if(number1 <= smallest)
		{
			System.out.println(number1+" is smallest");
			smallest = number1;
		}
		}
	}
}

