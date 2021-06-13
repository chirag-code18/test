package voting;
import java.util.Scanner;
public class eligible {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int ag = sc.nextInt();
		if (ag>=18)
		{
			System.out.println("Eligible");
		}
		else
			System.out.println("Not Eligible");
	}

}
