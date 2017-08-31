import java.io.*;

class Aray
{
	int i=0,j=0;
	int a[][],b[][],sum[][],sub[][],diag[][];
	public void Aray1()
	{
	  Console con=System.console();	
	  System.out.print("enter first matrix");	
	  	for(i=0;i<3;i++)
	  	{
	  		for(j=0;j<3;j++)
	  		{
	  				a[i][j]=Integer.parseInt(con.readLine());
	  	    }
	  	}
	  	System.out.print("enter second matrix");	
	  	 for(i=0;i<3;i++)
	  	{
	  		for(j=0;j<3;j++)
	  		{
	  				b[i][j]=Integer.parseInt(con.readLine());
	  	    }
	  	}
	}	
   public	void Aray2()
	{
		System.out.print("the first matrix is :-");
		
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("\n" +a[i][j]);
				}
			}
		System.out.print("the second matrix is :-");
		
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("\n" +b[i][j]);
				}
			}
	}
	public void add()
	{
	         for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		sum[i][j]=a[i][j]+b[i][j];
	         	}
	         }	
		 System.out.print("the sum of matrix is");
		 for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		System.out.print("\t" +sum[i][j]);
	         	}
	         }	
		}
		public void subtract()
	{
	         for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		sub[i][j]=a[i][j]-b[i][j];
	         	}
	         }	
		 System.out.print("the sum of matrix is");
		 for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		System.out.print("\t" +sub[i][j]);
	         	}
	         }	
		
	}
	public void addiagonal()
	{
	         for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		if(i==j)
	         		diag[i][j]=a[i][j]+b[i][j];
	         	}
	         }	
		 System.out.print("the sum of diagonal element of matrix is");
		 for(i=0;i<3;i++)
	         {
	         	for(j=0;j<3;j++)
	         	{
	         		System.out.print("\t" +diag[i][j]);
	         	}
	         }	
		
	}
	
	
}
class mainclass
{
	
public static void main(String args[])	
{
	System.out.println("enter 1 for display elements");
	System.out.println("\n enter 2 for addition");
	System.out.println("\n enter 3 for subtraction");
	System.out.println("\n enter 4 for sum of diagonal elements");
	
	Aray ob=new Aray();
	ob.Aray1();
	switch
	
	case 1:
	ob.Aray2();
    case 2:
    ob.add();
    case 3:
    ob.subtract();
    case 4:
    ob.addiagonal();
	
}
}