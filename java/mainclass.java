import java.io.*;

class Aray
{
	int i=0,j=0;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int sum[][]=new int[3][3];
	int sub[][]=new int[3][3];
	int diag[][]=new int[3][3];
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
	Console con=System.console();
	System.out.println("enter 1 for display elements");
	System.out.println("\n enter 2 for addition");
	System.out.println("\n enter 3 for subtraction");
	System.out.println("\n enter 4 for sum of diagonal elements");
	System.out.println("\n enter 5 for input elements");
	int num=Integer.parseInt(con.readLine());
	Aray ob=new Aray();
	
	switch(num)
	{
	case 1:
	ob.Aray2();
	break;
    case 2:
    ob.add();
    break;
    case 3:
    ob.subtract();
    break;
    case 4:
    ob.addiagonal();
	break;
	case 5:
	ob.Aray1();
	break;	
	}
}
}