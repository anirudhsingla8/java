import java.awt.*;
class Xy
{
Frame F;
Label L,L1;
TextField T,T1;


Xy()
{
F=new Frame();
F.setSize(400,400);
F.setLayout(null);
L=new Label("X");
L.setBounds(30,360,40,30);
F.add(L);
T=new TextField();
T.setBounds(80,360,40,30);
F.add(T);
L1=new Label("Y");
L1.setBounds(130,360,40,30);
F.add(L1);
T1=new TextField();
T1.setBounds(180,360,40,30);
F.add(T1);
F.setVisible(true);
}
public static void main(String z[])
{
Xy ob=new Xy();

}


}


