import java.awt.*;
import java.awt.event.*;
class Demo implements ActionListener();
{
Frame F;
Label L,L1,L2;
TextField T,T1,T2;
Button B,B1;


Demo()
{
F=new Frame();
F.setSize(400,400);
F.setLayout(null);
L=new Label("RED");
L.setBounds(30,30,30,30);
F.add(L);
T=new TextField();
T.setBounds(70,30,30,30);
F.add(T);
L1=new Label("BLUE");
L1.setBounds(30,70,30,30);
F.add(L1);
T1=new TextField();
T1.setBounds(70,70,30,30);
F.add(T1);
L2=new Label("GREEN");
L2.setBounds(30,110,30,30);
F.add(L2);
T2=new TextField();
T2.setBounds(70,110,30,30);
F.add(T2);
B=new Button("OK");
B.setBounds(30,150,30,20);
F.add(B);
B1=new Button("CANCEL");
B1.setBounds(70,150,60,20);
F.add(B1);
B.addActionListener(this);
B1.addActionListener(this);
F.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	int a=Integer.ParseInt(T.getText());
    int b=Integer.ParseInt(T1.getText());
	int c=Integer.ParseInt(T2.getText());
    if(ob==B)
  	F.setBackground(a,b,c);	
}
public static void main(String z[])
{
Demo ob=new Demo();

}


}
