import java.util.*;
class Arraylis
{
public static void main(String args[])
{
ArrayList<String> arrList=new ArrayList<>();
arrList.add("Cricet");
arrList.add("Hockey");
arrList.add(0,"BasketBall");
arrList.add(1,"lemon in the spoon");
System.out.println("ArrayList Elements: ");
for(String str:arrList)
System.out.println(str);
}
}