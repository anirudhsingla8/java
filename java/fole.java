import java.awt.*;
import java.awt.event.*;
class Fole implements ActionListener
{
	TextField t,t1,t2;
    Button b;
    int a=0,b1=0,c=0;
	Frame f;
	Fole()
	{
		 f=new Frame();
		f.setSize(400,400);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
		Label L=new Label("red");
		L.setBounds(40,40,40,20);
		f.add(L);
		t=new TextField();
		t.setBackground(Color.red);
		t.setBounds(90,40,40,20);
		f.add(t);
		Label L1=new Label("blue");
		L1.setBounds(40,70,40,20);
		f.add(L1);
		t1=new TextField();
		t1.setBackground(Color.blue);
		t1.setBounds(90,70,40,20);
		f.add(t1);
		Label L2=new Label("green");
		L2.setBounds(40,100,40,20);
		f.add(L2);
		t2=new TextField();
		t2.setBackground(Color.green);
		t2.setBounds(90,100,40,20);
		f.add(t2);
		b=new Button("ok");
		b.setBounds(50,140,40,20);
		f.add(b);
		b.addActionListener(this);
	    f.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	
	a=Integer.parseInt(t.getText());
	
	b1=Integer.parseInt(t1.getText());
	
	c=Integer.parseInt(t2.getText());
	Color c1=new Color(a,b1,c);
	f.setBackground(c1);

}
    public static void main(String z[])
	{
	Fole ob=new Fole();	
	}
}
