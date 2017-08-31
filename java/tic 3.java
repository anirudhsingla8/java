import java.awt.*;
import java.awt.event.*;

class Tic implements ActionListener
{
	TextField t,t0; 
	int count=0;
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
		t=new TextField();
		t.setBounds(160,50,50,50);
		f.add(t);
		Label L2=new Label("second player");
		L2.setBounds(50,120,100,50);
		f.add(L2);
		 t0=new TextField();
		t0.setBounds(160,120,50,50);
		f.add(t0);
		 b1=new Button();
		b1.setBounds(50,200,20,20);
		f.add(b1);
		 b2=new Button();
		b2.setBounds(90,200,20,20);
		f.add(b2);
		 b3=new Button();
		b3.setBounds(130,200,20,20);
		f.add(b3);
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
	
	count++;
	
	Object ob=e.getSource();
	{
	{if(count==1||count==3||count==5||count==7||count==9)
		{
        letter="*";
		}
		else if(count==2||count==4||count==6||count==8||count==10)
	    {
        letter="0";
        }
		{
		
	if(ob==b1)
	{
		b1.setLabel(""+letter);
		b1.setEnabled(false);
	}
	else if(ob==b2)
	{
		b2.setLabel(""+letter);
		b2.setEnabled(false);
	}
	else if(ob==b3)
	{
		b3.setLabel(""+letter);
	b3.setEnabled(false);
	}	
	else if(ob==b4)
	{
		b4.setLabel(""+letter);
	b4.setEnabled(false);
	}	
	else if(ob==b5)
	{
		b5.setLabel(""+letter);
	b5.setEnabled(false);
	} 
	else if(ob==b6)
	{
		b6.setLabel(""+letter); 
		b6.setEnabled(false);
		}
		else if(ob==b7)
		{
			b7.setLabel(""+letter);
		b7.setEnabled(false);
		} 
		else if(ob==b8)
		{
			b8.setLabel(""+letter); 
			b8.setEnabled(false);
			}
		else if(ob==b9)
		{
			b9.setLabel(""+letter);
		b9.setEnabled(false);
		} 
		
	if( b1.getLabel()==b2.getLabel() && b2.getLabel()==b3.getLabel() && b1.getLabel()!="")
		{
win=true;
}
else if(b4.getLabel()==b5.getLabel() && b5.getLabel()==b6.getLabel() && b4.getLabel()!="")
{
win=true;
}
else if(b7.getLabel()==b8.getLabel()&&b8.getLabel()==b9.getLabel() && b7.getLabel()!= "")
{
win=true;
}
else if(b1.getLabel()==b4.getLabel() && b4.getLabel()==b7.getLabel() && b1.getLabel()!= "")
{
win=true;
}
else if(b2.getLabel()==b5.getLabel() && b5.getLabel()==b8.getLabel() && b2.getLabel()!= "")
{
win=true;
}
else if(b3.getLabel()==b6.getLabel() && b6.getLabel()==b9.getLabel() && b3.getLabel()!= "")
{
win=true;
}

else if(b1.getLabel()==b5.getLabel() && b5.getLabel()==b9.getLabel() && b1.getLabel()!= "")
{
win=true;
}
else if(b3.getLabel()==b5.getLabel() && b5.getLabel()==b7.getLabel() && b3.getLabel()!= ""){
win=true;
}
else 
{
win=false;
}


if(win==true)
{
JOptionPane.showMessageDialog(null,letter+" WINS!");
}
else if(count==9 && win==false)
{
JOptionPane.showMessageDialog(null,"Tie Game!");
}

	
	
	
	
	
	
		
	}}}}

	public static void main(String z[])
	{
	Tic ob=new Tic();
	}
}