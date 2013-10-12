import java.util.Scanner;
public class pow2 {
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.println("type base");
		double base = console.nextDouble();
		Scanner console1 = new Scanner (System.in);
		System.out.println("type expo");
		double expo = console1.nextDouble();
		double k = pow(base,expo);
		System.out.print(k);
		
		
	}
	public static double pow(double base, double expo)
	{
		double j=1;
		if (expo >=0)
		{
		for(int i=1; i<=expo; i++)
		{
			j= j*base;
		}
		return(j);
		}
		if (expo < 0)
		{
			double k;
			for(int i=-1; i>=expo; i--)
			{
				j= j*base;
				
				
			}
			k = 1/j;
			
			return (k);
		}
		return (1.0);
		
	}
}
