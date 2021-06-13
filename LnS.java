import java.util.Scanner;

public class LnS {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		int a = sc.nextInt();
		System.out.println("Enter Your number");
		int b = sc.nextInt();
		System.out.println("Enter Your number");
		int c = sc.nextInt();
		{
		if (a > b && a>c)
		{
			System.out.println("a is Largest");
		}
		else
			if(b > c)
			{
				System.out.println("b is Largest");
			}
			else
				System.out.println("c is Largest");
		}
		if (a<b && a<c)
		{
			System.out.println("a is smallest");
		}
		else
			if(b < c)
			{
				System.out.println("b is smallest");
			}
			else
				System.out.println("c is smallest");
	}

}
