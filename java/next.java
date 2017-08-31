import java.awt.*;
import java.awt.event.*;
class Next implements MouseMotionListener
{
	

	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Next()
	{
	
	    f=new Frame();
		f.setSize(400,400);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
		l1=new Label("x");
		l1.setBounds(40,40,20,20);
		f.add(l1);
        t1=new TextField();
		t1.setBounds(70,40,50,20);
		f.add(t1);
		l2=new Label("y");
		l2.setBounds(40,70,20,20);
		f.add(l2);
		t2=new TextField();
		t2.setBounds(70,70,50,20);
		f.add(t2);
		f.addMouseMotionListener(this);
		f.setVisible(true);
		}
		public void mouseMoved(MouseEvent e)
		{
		Object ob=e.getSource();
		    int a=getY();
		    int b=getX();
		    t1.setText(""+b);
		    t2.setText(""+a);
		 }
		public void mouseDragged(MouseEvent e)
		{
		}

public static void main(String z[])
	{
	Next ob=new Next();	
	}
}	