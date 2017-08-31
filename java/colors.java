import java.awt.*;
class Colors
{
	
	Colors()
	{
		Frame f=new Frame();
		f.setSize(600,600);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
		Label L=new Label("red");
		L.setBounds(20,550,50,20);
		f.add(L);
		TextField t2=new TextField();
		t2.setBackground(Color.red);
		t2.setBounds(90,550,50,20);
		f.add(t2);
		Label L2=new Label("blue");
		L2.setBounds(150,550,50,20);
		f.add(L2);
		TextField t=new TextField();
		t.setBackground(Color.blue);
		t.setBounds(210,550,50,20);
		f.add(t);
	    Label L3=new Label("green");
		L3.setBounds(270,550,50,20);
		f.add(L3);
		TextField t1=new TextField();
		t1.setBackground(Color.green);
		t1.setBounds(330,550,50,20);
		f.add(t1);
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
	public static void main(String z[])
	{
	Colors ob=new Colors();	
	}
}