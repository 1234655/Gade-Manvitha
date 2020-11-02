package Employee;
class Sample<E>
{
void show(E a)	{
	System.out.println(a);
	
}
	}


public class GenericDemo {
public static void main(String args[])
{
	Sample<Integer> s=new Sample<Integer>();
	s.show(100);
	Sample<Double> s1=new Sample<Double>();
	s1.show(55.3);
	Sample<String> k=new Sample<String>();
	k.show("Hello");
	Sample x=new Sample();
	x.show(100);
	x.show(55.3);
	x.show("bye");
	
}
}
