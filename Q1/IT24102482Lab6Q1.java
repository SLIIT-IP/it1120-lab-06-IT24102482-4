import java.util.Scanner;
public class IT24102482Lab6Q1
{
	public static void main(String[] args)
	{
		double square, square_root;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		//Finding square of the number;

		square = Math.pow(num,2);
		System.out.println("The square of "+ "" +" is "+ square);

		//Finding the square root of the number;

		square_root = Math.sqrt(num);
		System.out.println("The square root of " + "" +" is "+ square_root);

		}
}