import java.io.*;
class Eo
{
double n;
Eo()
{
Console con=System.console();
System.out.print("enter number");
n=Integer.parseInt(con.readLine());
}
}
class Eo3 extends Eo
{
	Eo3()
	{
	}
}
class Eo2 extends Eo3
{
	Eo2()
{
	if(n%2==0)
	{
		System.out.print("number is even ");
    }
    else
    {
    	System.out.print("number is odd");
    }
}
public static void main(String z[])
{
Eo2 ob=new Eo2();
}
}