import java.util.*;
public class Sampletreeset
{
	public static void main(String args[])
	{
		TreeSet<String> set = new TreeSet<>();
		set.add("Pen");
		set.add("Pencil");
		set.add("Ereaser");
		set.add("Ruler");
		set.remove("Pencil");
		
		Iterator <String> it = set.iterator();
		while(it.hasNext())
{
System.out.println(it.next());
			
}
}
}