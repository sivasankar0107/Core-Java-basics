import java.util.*;
public class Vector
{
public static void main(String args[])
{
Vector <String> v=new Vector <> ();
v.add("item1");
v.add("item2");
v.add("item3");
v.remove("item2");
System.out.println("Vector Elements: ");
Iterator<String> it=v.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}
