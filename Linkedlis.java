import java.util.*;
public class Linkedlis
{
public static void  main(String args [])
{
LinkedList<String> linkList=new LinkedList<>();
linkList.add("Apple");
linkList.add("Mango");
linkList.add(0,"Goa");
System.out.println("LinkedList elements:");
Iterator<String>it=linkList.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}

