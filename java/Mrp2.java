import java.io.*;
class Mrp
{
int m,m1,m2,d,t;
Mrp()
{
Console con=System.console();
System.out.print("enter price");
m=Integer.parseInt(con.readLine());
m1=Integer.parseInt(con.readLine());
m2=Integer.parseInt(con.readLine());
t=m+m1+m2;
System.out.print("price is "+t);
}
}
class Mrp3 extends Mrp
{
	Mrp3()
	{
	}
}
class Mrp2 extends Mrp
{
	Mrp2()
{
	System.out.print("price is "+t);
}
}
class Mrp4
{
	Mrp4()
	{
	}	
public static void main(String z[])
{
Mrp2 ob=new Mrp2();
Mrp3 ob1=new Mrp3();
}
}