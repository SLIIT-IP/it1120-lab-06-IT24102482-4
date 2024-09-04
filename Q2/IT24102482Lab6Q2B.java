import java.util.Scanner;
public class IT24102482Lab6Q2B
{
	public static void main(String[] args)
	{
		int num=1;
		int count=1;
		String x =" ";

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 numbers:");
	
		while(count<=10)
		{
			System.out.print("Enter number" + count +":");
			num = sc.nextInt();
			x+=num+" ";
			count++;
		}
			System.out.print("The numbers you entered are: \n" +x);
	}
}