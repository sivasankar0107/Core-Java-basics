import java.util.Scanner;
import java.lang.*;
public class Array2
{
public static void main(String args[])
{
String names;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Name:");
names=sc.nextLine();
if (names.equals("siva"))
{
 System.out.println("RSP12001");
}
else if(names.equals("shankar"))
{
System.out.println("RSP12002");
}
else
System.out.println("Enter valid name");
}}