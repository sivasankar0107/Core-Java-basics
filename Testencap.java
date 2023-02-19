class Bank
{
private int account;
private String name;

public int getAccount()
{
return account;
}
public String getName()
{
return name;
}
public void setAccount(int acc)
{
this.account=acc;
}
public void setName(String cha)
{
this.name=cha;
}
}

class Testencap
{
public static void main(String args[])
{
Bank obj=new Bank();
obj.setAccount(12345);
obj.setName("shiva");
System.out.println("Account"+obj.getAccount());
System.out.println("Name"+obj.getName());
}
}

