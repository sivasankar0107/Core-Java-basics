import java.util.*;
public class Sampleset
{
	public static void main(String args[])
	{
		HashSet<String> set = new HashSet<>();
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