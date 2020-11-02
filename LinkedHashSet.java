package Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class LinkedHashSet {
	public static void main(String args[])
	{
		

LinkedHashSet<String> hs = new LinkedHashSet<String>(); 
hs.add("F");
hs.add("S");
hs.add("D");
hs.add("O");
hs.add("L");
hs.add("K");
hs.add("M");
hs.add("P");
hs.add("Q");
hs.add("R");
hs.add("Z");
System.out.println(hs);
Iterator<String> i= hs.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}


}
}