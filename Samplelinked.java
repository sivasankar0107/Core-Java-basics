import java.util.*;
public class Samplelinked
{
	public static void main(String args[])
	{
		LinkedHashSet<String> set = new LinkedHashSet<>();
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