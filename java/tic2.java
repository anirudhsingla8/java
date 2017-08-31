import java.awt.*;
import java.awt.event.*;
class Tic implements ActionListener
{
	int a=0;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Tic()
	{
		Frame f=new Frame();
		f.setSize(400,400);
		f.setLayout(null);
		f.setBackground(Color.red);
		f.setForeground(Color.blue);
		Label L=new Label("first player");
		L.setBounds(50,50,100,50);
		f.add(L);
		TextField t=new TextField();
		t.setBounds(160,50,50,50);
		f.add(t);
		Label L2=new Label("second player");
		L2.setBounds(50,120,100,50);
		f.add(L2);
		TextField t0=new TextField();
		t0.setBounds(160,120,50,50);
		f.add(t0);
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
	for(a=0;a++;a=a/2)
	{
	if(a/2==0)
	{
		b1.setLabel("*");
	
		
	
	b2.setLabel("*");
	
	b3.setLabel("*");
	b4.setLabel("*");
	
	b5.setLabel("*"); 
	
	b6.setLabel("*");
	
	b7.setLabel("*");
		
	
	b8.setLabel("*");
	
    b9.setLabel("*");
	}
	else
	{
		b1.setLabel("0");
	
		
	
	b2.setLabel("0");
	
	b3.setLabel("0");
	b4.setLabel("0");
	
	b5.setLabel("0"); 
	
	b6.setLabel("0");
	
	b7.setLabel("0");
		
	
	b8.setLabel("0");
	
    b9.setLabel("0");
	}	
	}
}
	public static void main(String z[])
	{
	Tic ob=new Tic();
	}
}