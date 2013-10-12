import java.util.Scanner;
public class triangle {
	public static void main(String[] args)
	{
		Scanner console1 = new Scanner (System.in);
		System.out.println("Enter number");
		int number1 = console1.nextInt();
		Scanner console2 = new Scanner (System.in);
		int number2 = console2.nextInt();
		Scanner console3 = new Scanner (System.in);
		int number3 = console3.nextInt();
		printTriangleType(number1, number2, number3);
	}
	public static void printTriangleType(int number1, int number2, int number3)
	{
		
		if(number1 == number2 && number2 == number3)
		{
			System.out.println("equilateral triangle");
		}
		else if(number1 == number2 || number2 == number3 || number1 == number3)
		{
			System.out.println("isosceles triangle");
		}
		else if(number1 != number2 && number2 !=number3)
		{
			System.out.println("scalene triangle");
		}
	}
}
