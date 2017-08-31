import java.awt.*;
class Ani
{
	Ani()
	{
		Frame f=new Frame();
		f.setSize(300,300);
		f.setLayout(null);
		f.setBackground(Color.red);
		f.setForeground(Color.blue);
		Label L=new Label("Name");
		L.setBounds(100,100,40,30);
		f.add(L);
		TextField t=new TextField();
		t.setBounds(160,100,50,25);
		f.add(t);
		Label L2=new Label("F Name");
		L2.setBounds(100,150,50,25);
		f.add(L2);
		TextField t1=new TextField();
		t1.setBounds(160,150,50,25);
		f.add(t1);
		Button b=new Button("OK");
		b.setBounds(100,190,30,30);
		f.add(b);
		Button b2=new Button("CANCEL");
		b2.setBounds(140,190,150,30);
		f.add(b2);
		f.setVisible(true);
}
public static void main(String z[])
{
	Ani ob=new Ani();
}
}