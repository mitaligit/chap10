import java.util.Scanner;
public class evensum {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("How many integers");
		int number = console.nextInt();
		evenSum(number);
	}
	public static void evenSum(int number)
	{	
		
		int sum = 0;
		int largest = 0;
		for(int i=1; i<=number; i++)
		{
		Scanner console1 = new Scanner (System.in);	
		System.out.println("Number "+i+";");
		int number1 = console1.nextInt();
		if ((number1%2) == 0)
		{
			sum = sum +number1;
			System.out.println("sum is "+ sum);
			if(number1 >= largest)
			{
				System.out.println(number1+" is largest");
				largest = number1;
			}
			
		}
		}
		
	}

}
