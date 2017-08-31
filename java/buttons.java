import java.awt.*;
import java.awt.event.*;
class Buttons implements ActionListener 
{
	Frame f;
	Button b,b1,b2,b3,b4,b5,b7,b6;
	Buttons()
	{
	    f=new Frame();
		f.setSize(600,600);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
	    b=new Button("red");
	    b.setBackground(Color.red);
		b.setBounds(50,40,50,20);
		f.add(b);
		 b2=new Button("blue");
		b2.setBackground(Color.blue);
		b2.setBounds(50,70,50,20);
		f.add(b2);
		 b1=new Button("green");
		b1.setBackground(Color.green);
		b1.setBounds(50,100,50,20);
		f.add(b1);
		 b3=new Button("yelow");
		b3.setBackground(Color.yellow);
		b3.setBounds(50,130,50,20);
		f.add(b3);
		b4=new Button("orange");
		b4.setBackground(Color.orange);
		b4.setBounds(50,160,50,20);
		f.add(b4);
		 b5=new Button("black");
		b5.setForeground(Color.yellow);
		b5.setBackground(Color.black);
		b5.setBounds(50,190,50,20);
		f.add(b5);
	     b6=new Button("pink");
		b6.setBackground(Color.pink);
		b6.setBounds(50,220,50,20);
		f.add(b6);
		 b7=new Button("red");
		b7.setBackground(Color.red);
		b7.setBounds(50,250,50,20);
		f.add(b7);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		f.setVisible(true);
		}

public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	if(ob==b1)
	f.setBackground(Color.green);
	if(ob==b2)
	f.setBackground(Color.blue);
	if(ob==b)
	f.setBackground(Color.red);
	if(ob==b3)
	f.setBackground(Color.yellow);
	if(ob==b4)
	f.setBackground(Color.orange);
	if(ob==b5)
	f.setBackground(Color.black);
	if(ob==b6)
	f.setBackground(Color.pink);
	if(ob==b7)
	f.setBackground(Color.red);
}
	public static void main(String z[])
	{
	Buttons ob=new Buttons();	
	}
}

