import java.io.*;
class Area
{
double r,a;
Area()
{
Console con=System.console();
System.out.print("enter radius");
r=Integer.parseInt(con.readLine());
}
}
class Area2 extends Area
{
	Area2()
{
	a=3.14*r*r;
	System.out.print("area is "+a);
}

public static void main(String z[])
{
Area2 ob=new Area2();
}
}