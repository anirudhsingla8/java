import java.io.*;
class Fac
{
int n,i,k=1;
Fac()
{
Console con=System.console();
System.out.print("enter number");
n=Integer.parseInt(con.readLine());
}
}
class Fac3 extends Fac
{
	Fac3()
	{
	}
}
class Fac2 extends Fac3
{
	Fac2()
{
	for(i=n;i>=1;i--)
	{
		
		k=k*i;   
		
	}
	System.out.print("factorial is"+k);
}
public static void main(String z[])
{
Fac2 ob=new Fac2();
}
}