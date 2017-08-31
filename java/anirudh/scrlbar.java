import java.awt.*;
import java.awt.event.*;

class scrlbar implements AdjustmentListener

{
    Frame f;
    int a=0,b=0,c=0;
	Scrollbar s1,s2,s3;
	Label l1,l2,l3;
	TextField t1,t2,t3; 
    scrlbar()
	{
	     f=new Frame();
		f.setSize(800,600);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setForeground(Color.black);
		s1=new Scrollbar(Scrollbar.VERTICAL,0,0,5,260);
	    s1.setBounds(530,40,30,200);
		s1.setBackground(Color.red);
		f.add(s1);
		s2=new Scrollbar(Scrollbar.VERTICAL,0,0,5,260);
	    s2.setBounds(570,40,30,200);
		s2.setBackground(Color.green);
		f.add(s2);
	    s3=new Scrollbar(Scrollbar.VERTICAL,0,0,5,260);
	    s3.setBounds(610,40,30,200);
		s3.setBackground(Color.blue);
		f.add(s3);
		t1=new TextField();
		t1.setBounds(30,30,40,20);
		f.add(t1);
		t2=new TextField();
		t2.setBounds(30,70,40,20);
		f.add(t2);
		t3=new TextField();
		t3.setBounds(30,110,40,20);
		f.add(t3);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);

        f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		Object ob=e.getSource();
		
		if(ob==s1)
		{
			a=s1.getValue();
			t1.setText(""+a);
		}
		else if(ob==s2)
		{
			b=s2.getValue();
			t2.setText(""+b);
		}
		
		else if(ob==s3)
		{
			c=s3.getValue();
			t3.setText(""+c);
		}
		Color c1=new Color(a,b,c);
		f.setBackground(c1);
		
		
 }
public static void main(String z[])
	{
	scrlbar ob=new scrlbar();	
	}
}	