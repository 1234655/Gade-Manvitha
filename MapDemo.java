package Employee;
import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
public static void main(String args[])
{
	LinkedHashMap<Integer,String> hs = new LinkedHashMap<Integer,String>();
	hs.put(123, "vinod");
	hs.put(143,"anu" );
	hs.put(12, "vinnu");
	hs.put(14,"anuradha" );
	hs.put(120, "manvi");
	hs.put(149,"vinay" );
	hs.put(128, "manu");
	hs.put(145,"swetha" );
	System.out.println(hs);
Set<Map.Entry<Integer,String>> s=hs.entrySet();
   for(Map.Entry<Integer,String x:s)
{
System.out.println(x.getKey()+" "+x.getValue());	
}
}
