import java.util.Scanner;
public class grade {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type number");
		int num = console.nextInt();
		getGrade(num);
		
		
	}
	public static void getGrade(int num)
	{
		if (num>=95)
		{
			System.out.println("your grade is 4.0");
		}
		else if(num >= 63 && num < 95)
		{
			double grade = 4.0 - (95-num) * .1;
			System.out.println("your grade is "+grade);	
		}
		else if(num >=60 && num <=62)
		{
			System.out.println("your grade is .7");	
		}
		else if(num <60)
		{
			System.out.println("your grade is 0.0");	
		}
		
	}
}
