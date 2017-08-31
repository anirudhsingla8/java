import java.awt.*;
import java.awt.event.*;
class Detail implements ActionListener
{
	
  int k=0;
  Frame f;
  Panel p1,p2,p3,p4;
  Label L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19,L20,L21,L22,L23,L24,L25,L26,L27,L28,L29,L30,L31,L32,L33,L34;
  TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34;
  Button b1;
  String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17;
  Detail()

{
   f=new Frame();
   f.setSize(700,700);
   f.setLayout(null);
   b1=new Button();
   b1.setLabel("next");
   b1.setBounds(40,640,40,30);
   p1=new Panel();
   p1.setSize(600,600);
   p1.setLayout(null);
   p2=new Panel();
   p2.setSize(600,600);
   p2.setLayout(null);
   p3=new Panel();
   p3.setSize(600,600);
   p3.setLayout(null);
   p4=new Panel();
   p4.setSize(600,600);
   p4.setLayout(null);
   
        
                Label L1=new Label("Name");
		L1.setBounds(20,110,60,20);
		f.add(L1);
		TextField t1=new TextField();
		t1.setBounds(90,110,50,20);
		f.add(t1);
	        Label L2=new Label("Admission no");
		L2.setBounds(20,140,80,20);
		f.add(L2);
		TextField t2=new TextField();
		t2.setBounds(110,140,50,20);
		f.add(t2);
		Label L3=new Label("Class and section");
		L3.setBounds(20,170,110,20);
		f.add(L3);
		TextField t3=new TextField();
		t3.setBounds(140,170,50,20);
		f.add(t3);	
		Label L4=new Label("Roll no");
		L4.setBounds(190,170,60,20);
		f.add(L4);
		TextField t4=new TextField();
		t4.setBounds(260,170,50,20);
		f.add(t4);
		Label L5=new Label("Father's name");
		L5.setBounds(20,290,160,20);
		f.add(L5);
		TextField t5=new TextField();
		t5.setBounds(190,290,50,20);
		f.add(t5);
		Label L6=new Label("Occupation");
		L6.setBounds(20,320,160,20);
		f.add(L6);
		TextField t6=new TextField();
		t6.setBounds(190,320,50,20);
		f.add(t6);
		Label L7=new Label("Mobile");
		L7.setBounds(250,320,100,20);
		f.add(L7);
		TextField t7=new TextField();
		t7.setBounds(360,320,100,20);
		f.add(t7);	 
		Label L8=new Label("Mother's name");
		L8.setBounds(20,400,160,20);
		f.add(L8);
		TextField t8=new TextField();
		t8.setBounds(190,400,50,20);
		f.add(t8);	
		Label L9=new Label("Occupation");
		L9.setBounds(20,430,160,20);
		f.add(L9);
		TextField t9=new TextField();
		t9.setBounds(190,430,50,20);
		f.add(t9);
		Label L10=new Label("Mobile");
		L10.setBounds(250,430,100,20);
		f.add(L10);
		TextField t10=new TextField();
		t10.setBounds(360,430,100,20);
		f.add(t10);
		Label L11=new Label("Blood grp");
		L11.setBounds(320,170,60,20);
		f.add(L11);
		TextField t11=new TextField();
		t11.setBounds(390,170,50,20);
		f.add(t11);	
		Label L12=new Label("Any other Medical instruction");
		L12.setBounds(20,200,160,20);
		f.add(L12);
		TextField t12=new TextField();
		t12.setBounds(190,200,50,20);
		f.add(t12);			
		Label L13=new Label("Name of grp of school");
		L13.setBounds(20,230,160,20);
		f.add(L13);
		TextField t13=new TextField();
		t13.setBounds(190,230,50,20);
		f.add(t13);		
		Label L14=new Label("Residential adress");
		L14.setBounds(20,260,160,20);
		f.add(L14);
		TextField t14=new TextField();
		t14.setBounds(190,260,50,20);
		f.add(t14);	 
		Label L15=new Label("Local guardian");
		L15.setBounds(20,490,160,20);
		f.add(L15);
		TextField t15=new TextField();
		t15.setBounds(190,490,50,20);
		f.add(t15);
		Label L16=new Label("Mobile no");
		L16.setBounds(250,490,100,20);
		f.add(L16);
		TextField t16=new TextField();
		t16.setBounds(360,490,100,20);
		f.add(t16);
		Label L17=new Label("brother and sister");
		L17.setBounds(20,550,160,20);
		f.add(L17);
		TextField t17=new TextField();
		t17.setBounds(190,550,50,20);
		f.add(t17);		
                

                Label L18=new Label("Name");
		L18.setBounds(20,110,60,20);
		f.add(L18);
		TextField t18=new TextField();
		t18.setBounds(90,110,50,20);
		f.add(t18);
	        Label L19=new Label("Admission no");
		L19.setBounds(20,140,80,20);
		f.add(L19);
		TextField t19=new TextField();
		t19.setBounds(110,140,50,20);
		f.add(t19);
		Label L20=new Label("Class and section");
		L20.setBounds(20,170,110,20);
		f.add(L20);
		TextField t20=new TextField();
		t20.setBounds(140,170,50,20);
		f.add(t20);	
		Label L21=new Label("Roll no");
		L21.setBounds(190,170,60,20);
		f.add(L21);
		TextField t21=new TextField();
		t21.setBounds(260,170,50,20);
		f.add(t21);
		Label L22=new Label("Father's name");
		L22.setBounds(20,290,160,20);
		f.add(L22);
		TextField t22=new TextField();
		t22.setBounds(190,290,50,20);
		f.add(t22);
		Label L23=new Label("Occupation");
		L23.setBounds(20,320,160,20);
		f.add(L23);
		TextField t23=new TextField();
		t23.setBounds(190,320,50,20);
		f.add(t23);
		Label L24=new Label("Mobile");
		L24.setBounds(250,320,100,20);
		f.add(L24);
		TextField t24=new TextField();
		t24.setBounds(360,320,100,20);
		f.add(t24);	 
		Label L25=new Label("Mother's name");
		L25.setBounds(20,400,160,20);
		f.add(L25);
		TextField t25=new TextField();
		t25.setBounds(190,400,50,20);
		f.add(t25);	
		Label L26=new Label("Occupation");
		L26.setBounds(20,430,160,20);
		f.add(L26);
		TextField t26=new TextField();
		t26.setBounds(190,430,50,20);
		f.add(t26);
		Label L27=new Label("Mobile");
		L27.setBounds(250,430,100,20);
		f.add(L27);
		TextField t27=new TextField();
		t27.setBounds(360,430,100,20);
		f.add(t27);
		Label L28=new Label("Blood grp");
		L28.setBounds(320,170,60,20);
		f.add(L28);
		TextField t28=new TextField();
		t28.setBounds(390,170,50,20);
		f.add(t28);	
		Label L29=new Label("Any other Medical instruction");
		L29.setBounds(20,200,160,20);
		f.add(L29);
		TextField t29=new TextField();
		t29.setBounds(190,200,50,20);
		f.add(t29);			
		Label L30=new Label("Name of grp of school");
		L30.setBounds(20,230,160,20);
		f.add(L30);
		TextField t30=new TextField();
		t30.setBounds(190,230,50,20);
		f.add(t30);		
		Label L31=new Label("Residential adress");
		L31.setBounds(20,260,160,20);
		f.add(L31);
		TextField t31=new TextField();
		t31.setBounds(190,260,50,20);
		f.add(t31);	 
		Label L32=new Label("Local guardian");
		L32.setBounds(20,490,160,20);
		f.add(L32);
		TextField t32=new TextField();
		t32.setBounds(190,490,50,20);
		f.add(t32);
		Label L33=new Label("Mobile no");
		L33.setBounds(250,490,100,20);
		f.add(L33);
		TextField t33=new TextField();
		t33.setBounds(360,490,100,20);
		f.add(t33);
		Label L34=new Label("brother and sister");
		L34.setBounds(20,550,160,20);
		f.add(L34);
		TextField t34=new TextField();
		t34.setBounds(190,550,50,20);
		f.add(t34);		








		
		        p3.add(L18);
                p3.add(L19);
                p3.add(L20);
                p3.add(L21);
                p3.add(L22);
                p3.add(L23);
                p3.add(L24);
                p3.add(L25);
                p3.add(L26);
                p3.add(L27);
                   p3.add(L28);
                   p3.add(L29);
                   p3.add(L30);
                   p3.add(L31);
                   p3.add(L32);
                   p3.add(L33);
                   p3.add(L34);
                p3.add(t18);
                p3.add(t19);
                p3.add(t20);
                p3.add(t21);
                p3.add(t22);
                p3.add(t23);
                p3.add(t24);
                p3.add(t25);
                p3.add(t26);
                p3.add(t27);
                   p3.add(t28);
                   p3.add(t29);
                   p3.add(t30);
                   p3.add(t31);
                   p3.add(t32);
                   p3.add(t33);
                   p3.add(t34); 
		 
                
                
                
                
                
                
                
		
		        p1.add(b1);
                p1.add(L1);
                p1.add(L2);
                p1.add(L3);
                p1.add(L4);
                p1.add(L5);
                p1.add(L6);
                p1.add(L7);
                p1.add(L8);
                p1.add(L9);
                p1.add(L10);
                   p2.add(L11);
                   p2.add(L12);
                   p2.add(L13);
                   p2.add(L14);
                   p2.add(L15);
                   p2.add(L16);
                   p2.add(L17);
                p1.add(t1);
                p1.add(t2);
                p1.add(t3);
                p1.add(t4);
                p1.add(t5);
                p1.add(t6);
                p1.add(t7);
                p1.add(t8);
                p1.add(t9);
                p1.add(t10);
                   p2.add(t11);
                   p2.add(t12);
                   p2.add(t13);
                   p2.add(t14);
                   p2.add(t15);
                   p2.add(t16);
                   p2.add(t17);
                   
		                    
                
  
   
   
   f.add(p1);
   f.add(p2);
   f.add(p3);
   f.add(p4);
   f.add(b1);
   f.setVisible(true);
   p1.setVisible(true);
   p3.setVisible(false);
   p4.setVisible(false);
   p2.setVisible(false);
   b1.addActionListener(this);
   
}
public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	
	if(ob==b1)
	{
	
if(k==0)		
	   {
        p1.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p2.setVisible(true);
	    k++;
	   }
   else    if(k==1)
	   {
	   	  
	  p1.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
        p2.setVisible(false);



  s1=t1.getText();
  t18.setText(""+s1);

 s2=t2.getText();
  t19.setText(""+s2);

 s3=t3.getText();
  t20.setText(""+s3);

 s4=t4.getText();
  t21.setText(""+s4);

  s5=t5.getText();
  t22.setText(""+s5);

 s6=t6.getText();
  t23.setText(""+s6);

 s7=t7.getText();
  t24.setText(""+s7);

 s8=t8.getText();
  t25.setText(""+s8);
 
 s9=t9.getText();
  t26.setText(""+s9);

 s10=t10.getText();
  t27.setText(""+s10);

 s11=t11.getText();
  t28.setText(""+s11);

 s12=t12.getText();
  t29.setText(""+s12);

 s13=t13.getText();
  t30.setText(""+s13);

 s14=t14.getText();
  t31.setText(""+s14);

  s15=t15.getText();
  t32.setText(""+s15);

 s16=t16.getText();
  t33.setText(""+s16);

 s17=t17.getText();
  t34.setText(""+s17);

       
   k++;
	   }   
	
	
	}	
}

public static void main(String z[])
{
	Detail ob=new Detail();
}
} 