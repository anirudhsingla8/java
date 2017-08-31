import java.awt.*;
import java.awt.event.*;
class Tic implements ActionListener
{
	TextField t1,t2; 
	Label L1,L2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int k=0;
	Tic()
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(null);
		f.setBackground(Color.red);
		f.setForeground(Color.blue);
		Label L1=new Label("first player");
		L1.setBounds(50,50,100,50);
		f.add(L1);
		t1=new TextField();
		t1.setBounds(160,50,50,50);
		f.add(t1);
		L2=new Label("second player");
		L2.setBounds(50,120,100,50);
		f.add(L2);
		t2=new TextField();
		t2.setBounds(160,120,50,50);
		f.add(t2);
		 b2=new Button();
		b2.setBounds(50,200,20,20);
		f.add(b2);
		 b3=new Button();
		b3.setBounds(90,200,20,20);
		f.add(b3);
		 b1=new Button();
		b1.setBounds(130,200,20,20);
		f.add(b1);
		 b4=new Button();
		b4.setBounds(50,240,20,20);
		f.add(b4);
		 b5=new Button();
		b5.setBounds(90,240,20,20);
		f.add(b5);
		 b6=new Button();
		b6.setBounds(130,240,20,20);
		f.add(b6);
		 b7=new Button();
		b7.setBounds(50,280,20,20);
		f.add(b7);
		 b8=new Button();
		b8.setBounds(90,280,20,20);
		f.add(b8);
		 b9=new Button();
		b9.setBounds(130,280,20,20);
		f.add(b9);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	
	if(ob==b1)
	{ 
		if(k==0)
		{
			b1.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b1.setLabel("0");
	    	k=0;
	    }
	
	}
	
	if(ob==b2)
	{ 
		if(k==0)
		{
			b2.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b2.setLabel("0");
	    	k=0;
	    }
	
	}
		if(ob==b3)
	{ 
		if(k==0)
		{
			b3.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b3.setLabel("0");
	    	k=0;
	    }
	
	}
	
   if(ob==b4)
	{ 
		if(k==0)
		{
			b4.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b4.setLabel("0");
	    	k=0;
	    }
	
	}
	
	if(ob==b5)
	{ 
		if(k==0)
		{
			b5.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b5.setLabel("0");
	    	k=0;
	    }
	
	}
		if(ob==b6)
	{ 
		if(k==0)
		{
			b6.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b6.setLabel("0");
	    	k=0;
	    }
	
	} 
		
 if(ob==b7)
	{ 
		if(k==0)
		{
			b7.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b7.setLabel("0");
	    	k=0;
	    }
	
	}
	
	if(ob==b8)
	{ 
		if(k==0)
		{
			b8.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b8.setLabel("0");
	    	k=0;
	    }
	
	}
		if(ob==b9)
	{ 
		if(k==0)
		{
			b9.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	b9.setLabel("0");
	    	k=0;
	    }
	
	} 










}
public static void main(String z[])
	{
	Tic ob=new Tic();
	}
}