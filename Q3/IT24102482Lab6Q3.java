import java.util.Scanner;
public class IT24102482Lab6Q3
{
	public static void main(String[] args)
	{
		int num=0, count=1;
		double power_of_square=0;
		double root_square=0;

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter positive integers (Terminate input with -99):");
		
		while(true)
		{
			System.out.print("Enter a number:");
			num=sc.nextInt();
		
			if(num==-99)
			{
				break;
			}
			if(num<0)
			{
				System.out.println("Invalid input. Please enter a postive integer or -99 to terminate");
				continue;
			}
			power_of_square+=Math.pow(num,2);
			count++;
		}
			if(count>0)
			{
				root_square=Math.sqrt(power_of_square/count);
				System.out.print("The Root Mean Square (RMS) is: " + root_square);
			}
	}
}