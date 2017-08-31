import java.awt.*;
import java.awt.event.*;
class Tic implements ActionListener
{
	TextField t1,t2; 
		int k=0;
Label L1,L2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
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
	if(ob==b1 && ob==b2 && ob==b3 && ob==b4 && ob==b5 && ob==b6 && ob==b7 && ob==b8 && ob==b9)
	{ 
		if(k==0)
		{
			ob.setLabel("x");
			k++;
		}
	    else if(k==1)
	    {
	    	ob.setLabel("0");
	    	k=0;
	    }
	
	}
	
	
}
public static void main(String z[])
	{
	Tic ob=new Tic();
	}
}