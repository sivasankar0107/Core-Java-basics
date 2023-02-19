import java.util.*;
public class Hmap
{
public static void main(String args[])
{
HashMap<Integer,String> hmap=new HashMap<>();
hmap.put(101,"Chaitanya");
hmap.put(105,"Denver");
hmap.put(111,"Steev");
hmap.put(120,"joo");
Set set=hmap.entrySet();
Iterator iterator=set.iterator();
while(iterator.hasNext())
{
Map.Entry m=(Map.Entry)iterator.next();
System.out.print("key is: "+ m.getkey()+ " & Value is: ");
System.out.println(m.getValue());
}
}
}
