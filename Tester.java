package collection;

import java.util.ArrayList;
import java.util.List;
public class Tester {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
List<String> list1 = new ArrayList<>();//line 1
List<String> list2 = list1;//line 2
list2.add(new Integer(12), null);//line 3
System.out.println(list2.size());//line 4
}
}
