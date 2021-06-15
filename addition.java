package twodim;

public class addition {
	public static void main(String [] args)
	{
		int x[][]= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int y[][]= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int r[][] = new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0; j<=2; j++)
			{ 
				r[i][j]=x[i][j]+y[i][j]; 
				System.out.print(r[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
