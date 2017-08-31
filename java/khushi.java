import java.awt.*;
class khushi
{
	khushi()
	{
		Frame f=new Frame();
		f.setSize(300,300);
		f.setLayout(null);
		f.setBackground(Color.blue);
		f.setForeground(Color.green);
		Button b=new Button("RED");
		b.setBounds(50,50,100,50);
		f.add(b);
		Button b2=new Button("GREEN");
		b2.setBounds(50,120,100,50);
		f.add(b2);
		f.setVisible(true);
		}
		public static void main(String z[])
		{
			khushi ob=new khushi();
		}
}
