import java.util.Scanner;
public class IT24102482Lab6Q2C
{
	public static void main(String[] args)
	{
		int num=1;
		int count=1;
		int sum=0;
		String x =" ";

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
	
		while(count<=10)
		{
			System.out.print("Enter number" + count +":");
			num = sc.nextInt();
			x+=num+" ";
			sum+=num;
			count++;
		}
			//modify;
			double avg = sum/10;

			System.out.println("The numbers you entered are: \n" +x);
			System.out.println("Sum of the numbers: " + sum);
			System.out.println("Average of the numbers: " + avg);
	}
}