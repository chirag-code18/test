package thread;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demosync {
	
static int i;
	public static synchronized void check()
	{
		
		System.out.print((char)i);
	}
	
	public static void main(String[] args)
	{
		Thread fw = new Thread(new Runnable() {
			public void run()
			{
				try
				{
					FileWriter fw = new FileWriter("file.txt");
					fw.write("This is your file");
					fw.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		});
		Thread fr = new Thread(new Runnable() {
			public void run()
			{
				try
				{
					FileReader fr = new FileReader("file.txt");
				//nt i;
					while((i=fr.read())!=-1)
					{
						check();
					}
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		});
		fw.start();
		fr.start();
		
	}
}
