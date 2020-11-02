package Employee;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class ListIterator {
	public static void main(String args[])
	{
		Vector<Integer> sh = new Vector<Integer>();
		sh.add(12);
		sh.add(13);
		sh.add(14);
		sh.add(15);
		sh.add(16);
		sh.add(17);
		sh.add(18);
		sh.add(19);
		sh.add(20);
		System.out.println(sh);
ListIterator<Integer> e=sh.listIterator();		
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
		
		}
	}


