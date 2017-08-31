import java.awt.*;
import java.awt.event.*;
class Enter implements ActionListener
{
	TextField t,t1,t2;
	int a=0,b=0,c=0;
	Frame f;
	Button b1,b2,b3,b4;
Enter()
{
	        f=new Frame();
		f.setSize(500,500);
		f.setLayout(null);
		f.setBackground(Color.red);
		f.setForeground(Color.blue);
		Label L=new Label("enter first no");
		L.setBounds(50,70,100,50);
		f.add(L);
		t=new TextField();
		t.setBounds(160,70,50,50);
		f.add(t);
		Label L2=new Label("enter second no");
		L2.setBounds(50,130,100,50);
		f.add(L2);
		 t1=new TextField();
		t1.setBounds(160,130,50,50);
		f.add(t1);
		Label L1=new Label("result is");
		L1.setBounds(50,200,100,50);
		f.add(L1);
		t2=new TextField();
		t2.setBounds(160,200,50,50);
		f.add(t2);
		b1=new Button("+");
		b1.setBounds(50,260,30,30);
		f.add(b1);
		b2=new Button("-");
		b2.setBounds(90,260,30,30);
		f.add(b2);
		b3=new Button("*");
		b3.setBounds(130,260,30,30);
		f.add(b3);
		b4=new Button("/");
		b4.setBounds(170,260,30,30);
		f.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	
	a=Integer.parseInt(t.getText());
	
	b=Integer.parseInt(t1.getText());
	
	
	if(ob==b1)
	c=a+b;	
	if(ob==b2)
	c=a-b;	
	if(ob==b3)
	c=a*b;	
	if(ob==b4)
	c=a/b;
	
		
	t2.setText(" "+c);
	
	
	
	
}	
public static void main(String z[])
{
	Enter ob=new Enter();
}
}