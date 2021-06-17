package collection;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
	public static void main(String [] args)
	{
		 List<String> List1 = new ArrayList<>();
		 List1.add("Briyani");
		 List1.add("Chicken Tikka");
		 List1.add("Butter Chicken");
		 List<String> List2 = new ArrayList<>();
		 List2.add("Briyani");
		 List2.add("Chicken Tikka");
		 List2.add("Butter Chicken");
		 List1.removeAll(List2);
		 System.out.println("remove menu ="+ List1);
		 

	}

}
