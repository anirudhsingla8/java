import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

class Dbms implements ActionListener
{
    ResultSet rs;
    Statement st;
	int k=0;
	Frame f;
	Label L1,L2,L3,L4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3,b4,b5,b6;
Dbms()
{
	
	
   f=new Frame();
   f.setSize(700,700);
   f.setLayout(null);
   b1=new Button();
   b1.setLabel("cancel");
   b1.setBounds(40,640,40,30);
   b2=new Button();
   b2.setLabel("clear");
   b2.setBounds(90,640,40,30);	
   b3=new Button();
   b3.setLabel("add");
   b3.setBounds(140,640,40,30);	
   b4=new Button();
   b4.setLabel("update");
   b4.setBounds(190,640,40,30);	
   	b5=new Button();
   b5.setLabel("delete");
   b5.setBounds(240,640,40,30);			
      b6=new Button();
   b6.setLabel("search");
   b6.setBounds(290,640,40,30);	
        L1=new Label("Name");
		L1.setBounds(20,110,60,20);
		f.add(L1);
		 t1=new TextField();
		t1.setBounds(90,110,50,20);
		f.add(t1);
	     L2=new Label("email");
		L2.setBounds(20,140,80,20);
		f.add(L2);
		 t2=new TextField();
		t2.setBounds(110,140,50,20);
		f.add(t2);
		L3=new Label("Class and section");
		L3.setBounds(20,170,110,20);
		f.add(L3);
		 t3=new TextField();
		t3.setBounds(140,170,50,20);
		f.add(t3);	
	    L4=new Label("Roll no");
		L4.setBounds(190,170,60,20);
		f.add(L4);
		 t4=new TextField();
		t4.setBounds(260,170,50,20);
		f.add(t4);
		 
		
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.add(b4);
   f.add(b5);
   f.add(b6);
   f.add(L1);
   f.add(L2);
   f.add(L3);
   f.add(L4);
   f.add(t1);
   f.add(t2);
   f.add(t3);
   f.add(t4);

   f.setVisible(true);
   
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   t1.setEnabled(false);
   t2.setEnabled(false);
   t3.setEnabled(false);
   t4.setEnabled(false);
  
   	 
  try
   {
   	Class.forName("com.mysql.jdbc.Driver");
   	System.out.println("JDBC Driver class has been formed");
   	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/patientinfo","anirudh1608","anirudh1608");
   	st=con.createStatement();
   	JOptionPane.showMessageDialog(null,"connected");
   }
   catch(ClassNotFoundException e)
   {
   	System.out.println("\n JDBC driver not found"+e);
   }
   catch(SQLException e)
   {
   	System.out.println("\n SQL exception occur"+e);
   }
}
public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	if(ob==b3)
	{
		if(k==0)
	
	{
   t1.setEnabled(true);
   t2.setEnabled(true);
   t3.setEnabled(true);
   t4.setEnabled(true);
   b3.setLabel("submit");
   k++;
  }
   else if	(k==1)
   {
   	try
   	{
   		String q="Insert Into student1 values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
   		st.execute(q);
   		JOptionPane.showMessageDialog(null,q);   		
   	}
   	catch(Exception ex)
   	{
   		System.out.println(""+ex);
   		JOptionPane.showMessageDialog(null,"your exception is="+ex);
   	}
   	JOptionPane.showMessageDialog(null,"saved");
   	k=0;
   	}
   }
   if(ob==b2)
   {
   t1.setText(""); 
   t2.setText("");
   t3.setText("");
   t4.setText("");
   	}
   	if(ob==b5)
   	{
   		try
   		{
   			String s=JOptionPane.showInputDialog(null,"enter name student1");
   			st.execute("delete from student1 where name='"+s+"'");
   			JOptionPane.showMessageDialog(null,"Deleted");
   		}
   		catch(Exception ex)
   		{
   			System.out.print(ex);
   		}
   		
   		
   	}
   	if(ob==b4)
   	{
   	String s=JOptionPane.showInputDialog(null,"enter name","student1",0);	
   	 try
   	 	{
   	 		
   	 		String k1=JOptionPane.showInputDialog(null,"enter name","student1",0);	
   	 		String k2=JOptionPane.showInputDialog(null,"enter email","student1",0);	
   	 		String k3=JOptionPane.showInputDialog(null,"enter classandsection","student1",0);	
   	 		String k4=JOptionPane.showInputDialog(null,"enter rollno","student1",0);	
   	        st.execute("update student1 set name='"+k1+"',email='"+k2+"',classandsection='"+k3+"',rollno='"+k4+"'where name='"+s+"'");
   	 		
   	 	}
   	 catch(Exception ef)
   	 {
   	 	JOptionPane.showMessageDialog(null,"your exception is"+ef);
   	 }		
   	}
   	   	
   	   	
   	if(ob==b6)
   	{
   	 String s=JOptionPane.showInputDialog(null,"enter name","student1",0);	
   	 System.out.println(s);
   	 try
   	 {
   	 	rs=st.executeQuery("select *from student1 where name='"+s+"'");
   	 	boolean flag=false;
   	 	while(rs.next())
   	 	{
   	 		String k1=rs.getString("name");
   	 		String k2=rs.getString("email");
   	 		String k3=rs.getString("classandsection");
   	 		String k4=rs.getString("rollno");
   	 		
   	 		JOptionPane.showMessageDialog(null,"name:-"+k1+"\nemail:-"+k2+"\nclassandsection:-"+k3+"\nrollno:-"+k4);
   	 		flag=true;
   	 		break;
   	 	}
   	 	if(flag==false)
   	 	{
   	 		JOptionPane.showMessageDialog(null,"data not found");
   	 	}
   	 }
   	 catch(Exception ef)
   	 {
   	 	JOptionPane.showMessageDialog(null,"your exception is"+ef);
   	 }	
   	}
}
public static void main(String z[])
{
	Dbms ob=new Dbms();
}
} 
