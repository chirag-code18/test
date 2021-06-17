package collection;
//Java code to demonstrate the working of
//get() method in ArrayList

//for ArrayList functions
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListManager1 {
	static List<String> getArrayList(String[] str){
		
		List l1 = Arrays.asList(str);
		Collections.sort(l1);
		return l1;
	}
	public static void main(String[] args)
	{
		String[] str= new String[] {"dog","cat","fish","bird"};
		System.out.println(getArrayList(str));
	}
}

