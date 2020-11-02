package Employee;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Queue;
import java.util.Vector;

public class Array {
	public static void main(String args[])
	{
		ArrayList<Integer> sh = new ArrayList<Integer>();
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
		sh.add(3,92);//adds 92 at 3rd position
		System.out.println(sh);
		System.out.println(sh.get(5));//returns the element with 5th position
		
		}
	}


