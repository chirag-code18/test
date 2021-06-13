package table;

import java.util.Scanner;

public class tables {
	public static void main(String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		int n = sc.nextInt();
		System.out.println("Enter Your number");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
	    System.out.println(n+"*"+i+"="+n*i);
		
	}

}
