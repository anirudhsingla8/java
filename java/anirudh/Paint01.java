import java.awt.*;
import java.awt.event.*;
class Paint01 implements ActionListener
{
	
Frame F;
Label L,L1,L2,L3,L4,L5,L6,L7;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68;
Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,c61,c62,c63,c64;
TextField T2,T3,T4,T5,T6,T7;
Scrollbar s;
Panel p,p1;
Paint01()
{
        F=new Frame("Edit Colors");
        F.setSize(700,500);
        F.setLayout(null);
            L=new Label("Basic Colors");
            L.setBounds(40,30,100,30);
            F.add(L);
c1=new Color(255,0,0);
b1=new Button();
b1.setBackground(c1);
b1.setBounds(20,60,20,20);
F.add(b1);
c2=new Color(0,255,0);
b2=new Button();
b2.setBackground(c2);
b2.setBounds(50,60,20,20);
F.add(b2);
c3=new Color(0,0,255);
b3=new Button();
b3.setBackground(c3);
b3.setBounds(80,60,20,20);
F.add(b3);
c4=new Color(120,0,0);
b4=new Button();
b4.setBackground(c4);
b4.setBounds(110,60,20,20);
F.add(b4);
c5=new Color(0,120,0);
b5=new Button();
b5.setBackground(c5);
b5.setBounds(140,60,20,20);
F.add(b5);
c6=new Color(0,0,120);
b6=new Button();
b6.setBackground(c6);
b6.setBounds(170,60,20,20);
F.add(b6);
c7=new Color(160,0,0);
b7=new Button();
b7.setBackground(c7);
b7.setBounds(200,60,20,20);
F.add(b7);
c8=new Color(0,160,0);
b8=new Button();
b8.setBackground(c8);
b8.setBounds(234,60,20,20);
F.add(b8);
c9=new Color(0,0,160);
b9=new Button();
b9.setBackground(c9);
b9.setBounds(20,90,20,20);
F.add(b9);
c10=new Color(60,0,0);
b10=new Button();
b10.setBackground(c10);
b10.setBounds(50,90,20,20);
F.add(b10);
c11=new Color(60,0,0);
b11=new Button();
b11.setBackground(c11);
b11.setBounds(80,90,20,20);
F.add(b11);
c12=new Color(0,60,0);
b12=new Button();
b12.setBackground(c12);
b12.setBounds(110,90,20,20);
F.add(b12);
c13=new Color(0,0,60);
b13=new Button();
b13.setBackground(c13);
b13.setBounds(140,90,20,20);
F.add(b13);
c14=new Color(240,0,0);
b14=new Button();
b14.setBackground(c14);
b14.setBounds(170,90,20,20);
F.add(b14);
c15=new Color(0,240,0);
b15=new Button();
b15.setBackground(c15);
b15.setBounds(200,90,20,20);
F.add(b15);
c16=new Color(0,0,240);
b16=new Button();
b16.setBackground(c16);
b16.setBounds(234,90,20,20);
F.add(b16);
c17=new Color(100,0,60);
b17=new Button();
b17.setBackground(c17);
b17.setBounds(20,120,20,20);
F.add(b17);
c18=new Color(0,100,60);
b18=new Button();
b18.setBackground(c18);
b18.setBounds(50,120,20,20);
F.add(b18);
c19=new Color(80,100,60);
b19=new Button();
b19.setBackground(c19);
b19.setBounds(80,120,20,20);
F.add(b19);
c20=new Color(120,100,60);
b20=new Button();
b20.setBackground(c20);
b20.setBounds(110,120,20,20);
F.add(b20);
c21=new Color(190,100,60);
b21=new Button();
b21.setBackground(c21);
b21.setBounds(140,120,20,20);
F.add(b21);
c22=new Color(10,100,60);
b22=new Button();
b22.setBackground(c22);
b22.setBounds(170,120,20,20);
F.add(b22);
c23=new Color(80,10,60);
b23=new Button();
b23.setBackground(c23);
b23.setBounds(200,120,20,20);
F.add(b23);
c24=new Color(80,10,0);
b24=new Button();
b24.setBackground(c24);
b24.setBounds(234,120,20,20);
F.add(b24);
c25=new Color(80,60,0);
b25=new Button();
b25.setBackground(c25);
b25.setBounds(20,150,20,20);
F.add(b25);
c26=new Color(80,60,20);
b26=new Button();
b26.setBackground(c26);
b26.setBounds(50,150,20,20);
F.add(b26);
c27=new Color(80,60,200);
b27=new Button();
b27.setBackground(c27);
b27.setBounds(80,150,20,20);
F.add(b27);
c28=new Color(0,60,20);
b28=new Button();
b28.setBackground(c28);
b28.setBounds(110,150,20,20);
F.add(b28);
c29=new Color(200,60,0);
b29=new Button();
b29.setBackground(c29);
b29.setBounds(140,150,20,20);
F.add(b29);
c30=new Color(80,0,80);
b30=new Button();
b30.setBackground(c30);
b30.setBounds(170,150,20,20);
F.add(b30);
c31=new Color(80,0,80);
b31=new Button();
b31.setBackground(c31);
b31.setBounds(200,150,20,20);
F.add(b31);
c32=new Color(80,8,80);
b32=new Button();
b32.setBackground(c32);
b32.setBounds(230,150,20,20);
F.add(b32);
c33=new Color(80,20,80);
b33=new Button();
b33.setBackground(c33);
b33.setBounds(20,180,20,20);
F.add(b33);
c34=new Color(0,20,80);
b34=new Button();
b34.setBackground(c34);
b34.setBounds(50,180,20,20);
F.add(b34);
c35=new Color(150,20,80);
b35=new Button();
b35.setBackground(c35);
b35.setBounds(80,180,20,20);
F.add(b35);
c36=new Color(80,20,0);
b36=new Button();
b36.setBackground(c36);
b36.setBounds(110,180,20,20);
F.add(b36);
c37=new Color(80,250,80);
b37=new Button();
b37.setBackground(c37);
b37.setBounds(140,180,20,20);
F.add(b37);
c38=new Color(0,20,20);
b38=new Button();
b38.setBackground(c38);
b38.setBounds(170,180,20,20);
F.add(b38);
c39=new Color(20,20,0);
b39=new Button();
b39.setBackground(c39);
b39.setBounds(200,180,20,20);
F.add(b39);
c40=new Color(9,4,6);
b40=new Button();
b40.setBackground(c40);
b40.setBounds(230,180,20,20);
F.add(b40);
c41=new Color(90,4,6);
b41=new Button();
b41.setBackground(c41);
b41.setBounds(20,210,20,20);
F.add(b41);
c42=new Color(9,40,6);
b42=new Button();
b42.setBackground(c42);
b42.setBounds(50,210,20,20);
F.add(b42);
c43=new Color(90,4,60);
b43=new Button();
b43.setBackground(c43);
b43.setBounds(80,210,20,20);
F.add(b43);
c44=new Color(9,4,60);
b44=new Button();
b44.setBackground(c44);
b44.setBounds(110,210,20,20);
F.add(b44);
c45=new Color(30,4,6);
b45=new Button();
b45.setBackground(c45);
b45.setBounds(140,210,20,20);
F.add(b45);
c46=new Color(9,90,6);
b46=new Button();
b46.setBackground(c46);
b46.setBounds(170,210,20,20);
F.add(b46);
c47=new Color(9,40,0);
b47=new Button();
b47.setBackground(c47);
b47.setBounds(200,210,20,20);
F.add(b47);
c48=new Color(250,0,6);
b48=new Button();
b48.setBackground(c48);
b48.setBounds(230,210,20,20);
F.add(b48);
L1=new Label("custom colors");
L1.setBounds(20,250,100,20);
F.add(L1);
c49=new Color(255,255,255);
b49=new Button();
b49.setBackground(c49);
b49.setBounds(20,280,20,20);
F.add(b49);
c50=new Color(255,255,255);
b50=new Button();
b50.setBackground(c50);
b50.setBounds(50,280,20,20);
F.add(b50);
c51=new Color(255,255,255);
b51=new Button();
b51.setBackground(c51);
b51.setBounds(80,280,20,20);
F.add(b51);
c52=new Color(255,255,255);
b52=new Button();
b52.setBackground(c52);
b52.setBounds(110,280,20,20);
F.add(b52);
c53=new Color(255,255,255);
b53=new Button();
b53.setBackground(c53);
b53.setBounds(140,280,20,20);
F.add(b53);
c54=new Color(255,255,255);
b54=new Button();
b54.setBackground(c54);
b54.setBounds(170,280,20,20);
F.add(b54);
c55=new Color(255,255,255);
b55=new Button();
b55.setBackground(c55);
b55.setBounds(200,280,20,20);
F.add(b55);
c56=new Color(255,255,255);
b56=new Button();
b56.setBackground(c56);
b56.setBounds(230,280,20,20);
F.add(b56);
c57=new Color(255,255,255);
b57=new Button();
b57.setBackground(c57);
b57.setBounds(20,310,20,20);
F.add(b57);
c58=new Color(255,255,255);
b58=new Button();
b58.setBackground(c58);
b58.setBounds(50,310,20,20);
F.add(b58);
c59=new Color(255,255,255);
b59=new Button();
b59.setBackground(c59);
b59.setBounds(80,310,20,20);
F.add(b59);
c60=new Color(255,255,255);
b60=new Button();
b60.setBackground(c60);
b60.setBounds(110,310,20,20);
F.add(b60);
c61=new Color(255,255,255);
b61=new Button();
b61.setBackground(c61);
b61.setBounds(140,310,20,20);
F.add(b61);
c62=new Color(255,255,255);
b62=new Button();
b62.setBackground(c62);
b62.setBounds(170,310,20,20);
F.add(b62);
c63=new Color(255,255,255);
b63=new Button();
b63.setBackground(c63);
b63.setBounds(200,310,20,20);
F.add(b63);
c64=new Color(255,255,255);
b64=new Button();
b64.setBackground(c64);
b64.setBounds(230,310,20,20);
F.add(b64);
b65=new Button("Define Custom Colors");
b65.setBounds(20,350,150,20);
F.add(b65);
b66=new Button("OK");
b66.setBounds(20,390,70,20);
F.add(b66);
b67=new Button("CANCEL");
b67.setBounds(100,390,70,20);
F.add(b67);
b68=new Button("Add to Custom Colors");
b68.setBounds(280,350,220,20);
F.add(b68);
                p=new Panel();
		p.setLayout(null);
		p.setBounds(280,60,290,170);
		p.setBackground(Color.blue);
		F.add(p);
	        p1=new Panel();
		p1.setLayout(null);
		p1.setBounds(280,250,100,80);
		p1.setBackground(Color.red);
		F.add(p1);
                s=new Scrollbar();
                s.setBounds(580,60,20,170);
                F.add(s);
L2=new Label("Hue:");
L2.setBounds(400,250,30,20);
F.add(L2);
L3=new Label("Sat:");
L3.setBounds(400,280,30,20);
F.add(L3);
L4=new Label("Lum:");
L4.setBounds(400,310,30,20);
F.add(L4);
          T2=new TextField();
          T2.setBounds(440,250,40,20);
          F.add(T2);
          T3=new TextField();
          T3.setBounds(440,280,40,20);
          F.add(T3);
          T4=new TextField();
          T4.setBounds(440,310,40,20);
          F.add(T4);
L5=new Label("Red:");
L5.setBounds(500,250,40,20);
F.add(L5);
L6=new Label("Green:");
L6.setBounds(500,280,40,20);
F.add(L6);
L7=new Label("Blue:");
L7.setBounds(500,310,40,20);
F.add(L7);
          T5=new TextField();
          T5.setBounds(550,250,40,20);
          F.add(T5);
          T6=new TextField();
          T6.setBounds(550,280,40,20);
          F.add(T6);
          T7=new TextField();
          T7.setBounds(550,310,40,20);
          F.add(T7);

                 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 b4.addActionListener(this);
                 b5.addActionListener(this);
		 b6.addActionListener(this);
                 b7.addActionListener(this);
		 b8.addActionListener(this);
                 b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
                b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
                b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
                b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
                b22.addActionListener(this);
		b23.addActionListener(this);
                b24.addActionListener(this);
		b25.addActionListener(this);
                b26.addActionListener(this);
		b27.addActionListener(this);
                b28.addActionListener(this);
		b29.addActionListener(this);
                b30.addActionListener(this);
		b31.addActionListener(this);
                b32.addActionListener(this);
		b33.addActionListener(this);
                b34.addActionListener(this);
		b35.addActionListener(this);
                b36.addActionListener(this);
		b37.addActionListener(this);
                b38.addActionListener(this);
		b39.addActionListener(this);
                b40.addActionListener(this);
		b41.addActionListener(this);
                b42.addActionListener(this);
		b43.addActionListener(this);
                b44.addActionListener(this);
		b45.addActionListener(this);
                b46.addActionListener(this);
		b47.addActionListener(this);
                b48.addActionListener(this);
		b49.addActionListener(this);
                b50.addActionListener(this);
		b51.addActionListener(this);
                b52.addActionListener(this);
		b53.addActionListener(this);
                b54.addActionListener(this);
		b55.addActionListener(this);
                b56.addActionListener(this);
		b57.addActionListener(this);
                b58.addActionListener(this);
		b59.addActionListener(this);
                b60.addActionListener(this);
		b61.addActionListener(this);
                b62.addActionListener(this);
		b63.addActionListener(this);
                b64.addActionListener(this);
		b65.addActionListener(this);
                b66.addActionListener(this);
		b67.addActionListener(this);
                b68.addActionListener(this);                         
                
 F.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	Object ob=e.getSource();
	      

	       if(ob==b1)
              {
               int a=c1.getRed();
               int b=c1.getGreen();
               int c=c1.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c1);
              }
              if(ob==b2)
              {
               int a=c2.getRed();
               int b=c2.getGreen();
               int c=c2.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c2);
              }
               if(ob==b3)
              {
               int a=c3.getRed();
               int b=c3.getGreen();
               int c=c3.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c3);
              }
	       if(ob==b4)
              {
               int a=c4.getRed();
               int b=c4.getGreen();
               int c=c4.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c4);
              }
	       if(ob==b5)
              {
               int a=c5.getRed();
               int b=c5.getGreen();
               int c=c5.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c5);
              }
               if(ob==b6)
              {
               int a=c6.getRed();
               int b=c6.getGreen();
               int c=c6.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c6);
              }
               if(ob==b7)
              {
               int a=c7.getRed();
               int b=c7.getGreen();
               int c=c7.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c7);
              }
	       if(ob==b8)
              {
               int a=c8.getRed();
               int b=c8.getGreen();
               int c=c8.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c8);
              }
	       
	       if(ob==b9)
              {
               int a=c9.getRed();
               int b=c9.getGreen();
               int c=c9.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);	
               p.setBackground(c9);
              }
              if(ob==b10)
              {
               int a=c10.getRed();
               int b=c10.getGreen();
               int c=c10.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c10);
              }
               if(ob==b11)
              {
               int a=c11.getRed();
               int b=c11.getGreen();
               int c=c11.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);			
               p.setBackground(c11);
              }
	       if(ob==b12)
              {
               int a=c12.getRed();
               int b=c12.getGreen();
               int c=c12.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c12);
              }
	       if(ob==b13)
              {
               int a=c13.getRed();
               int b=c13.getGreen();
               int c=c13.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c13);
              }
               if(ob==b14)
              {
               int a=c14.getRed();
               int b=c14.getGreen();
               int c=c14.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);			  
               p.setBackground(c14);
              }
               if(ob==b15)
              {
               int a=c15.getRed();
               int b=c15.getGreen();
               int c=c15.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c15);
              }
	       if(ob==b16)
              {
               int a=c16.getRed();
               int b=c16.getGreen();
               int c=c16.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c16);
              }
               if(ob==b17)
              {
               int a=c17.getRed();
               int b=c17.getGreen();
               int c=c17.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c17);
              }
              if(ob==b18)
              {
               int a=c18.getRed();
               int b=c18.getGreen();
               int c=c18.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c18);
              }
               if(ob==b19)
              {
               int a=c19.getRed();
               int b=c19.getGreen();
               int c=c19.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c19);
              }
	       if(ob==b20)
              {
               
               int a=c20.getRed();
               int b=c20.getGreen();
               int c=c20.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c20);
              }
	       if(ob==b21)
              {
               int a=c21.getRed();
               int b=c21.getGreen();
               int c=c21.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c21);
              }
               if(ob==b22)
              {
               int a=c22.getRed();
               int b=c22.getGreen();
               int c=c22.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c22);
              }
               if(ob==b23)
              {
               int a=c23.getRed();
               int b=c23.getGreen();
               int c=c23.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c23);
              }
	       if(ob==b24)
              {
               int a=c24.getRed();
               int b=c24.getGreen();
               int c=c24.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c24);
              }
	       if(ob==b25)
              {
               int a=c25.getRed();
               int b=c25.getGreen();
               int c=c25.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c25);
              }
               if(ob==b26)
              {
               int a=c26.getRed();
               int b=c26.getGreen();
               int c=c26.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c26);
              }
           if(ob==b27)
              {
               int a=c27.getRed();
               int b=c27.getGreen();
               int c=c27.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c27);
              }
	       if(ob==b28)
              {
               int a=c28.getRed();
               int b=c28.getGreen();
               int c=c28.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c28);
              }
	       if(ob==b29)
              {
               int a=c29.getRed();
               int b=c29.getGreen();
               int c=c29.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c29);
              }
               if(ob==b30)
              {
               int a=c30.getRed();
               int b=c30.getGreen();
               int c=c30.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c30);
              }
               if(ob==b31)
              {
               int a=c31.getRed();
               int b=c31.getGreen();
               int c=c31.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c31);
              }
	       if(ob==b32)
              {
               int a=c32.getRed();
               int b=c32.getGreen();
               int c=c32.getBlue();
               T5.setText(" "+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c32);
              }
               if(ob==b33)
              {
               int a=c33.getRed();
               int b=c33.getGreen();
               int c=c33.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c33);
              }
	       if(ob==b34)
              {
               int a=c34.getRed();
               int b=c34.getGreen();
               int c=c34.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c34);
              }
               if(ob==b35)
              {
               int a=c35.getRed();
               int b=c35.getGreen();
               int c=c35.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c35);
              }
               if(ob==b36)
              {
               int a=c36.getRed();
               int b=c36.getGreen();
               int c=c36.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c36);
              }
	       if(ob==b37)
              {
               int a=c37.getRed();
               int b=c37.getGreen();
               int c=c37.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c37);
              }
	       if(ob==b38)
              {
               int a=c38.getRed();
               int b=c38.getGreen();
               int c=c38.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c38);
              }
               if(ob==b39)
              {
               int a=c39.getRed();
               int b=c39.getGreen();
               int c=c39.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c39);
              }
               if(ob==b40)
              {
               int a=c40.getRed();
               int b=c40.getGreen();
               int c=c40.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c40);
              }
	       if(ob==b41)
              {
               int a=c41.getRed();
               int b=c41.getGreen();
               int c=c41.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c42);
              }
              if(ob==b42)
              {
               int a=c42.getRed();
               int b=c42.getGreen();
               int c=c42.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c42);
              }
	       if(ob==b43)
              {
               int a=c43.getRed();
               int b=c43.getGreen();
               int c=c43.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c43);
              }
               if(ob==b44)
              {
               int a=c44.getRed();
               int b=c44.getGreen();
               int c=c44.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c44);
              }
               if(ob==b45)
              {
               int a=c45.getRed();
               int b=c45.getGreen();
               int c=c45.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c45);
              }
	       if(ob==b46)
              {
               int a=c46.getRed();
               int b=c46.getGreen();
               int c=c46.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c46);
              }
               if(ob==b47)
              {
               int a=c47.getRed();
               int b=c47.getGreen();
               int c=c47.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c47);
              }
	       if(ob==b48)
              {
               int a=c48.getRed();
               int b=c48.getGreen();
               int c=c48.getBlue();
               T5.setText(""+a);
               T6.setText(""+b);
               T7.setText(""+c);		
               p.setBackground(c48);
              }
           
          
                int k=0;
           if(ob==b68)
           {
             if(k==0)
           {
           	int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b49.setBackground(c65);
            p1.setBackground(c65);
            k++;           }
           }
             else if(k==1)
             {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b50.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	
             else if(k==2)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b51.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	   
             else if(k==3)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b52.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	 	  	           	
             else if(k==4)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b53.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	
            else if(k==5)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b54.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }
            else if(k==6)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b55.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }else if(k==7)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b56.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	
            else if(k==8)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b57.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	  	 	  
            else if(k==9)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b58.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }
            else if(k==10)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b59.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }
            else if(k==11)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b60.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	  
           else if(k==12)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b61.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }
            else if(k==13)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b62.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }	 
            else if(k==14)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b63.setBackground(c65);
            p1.setBackground(c65);
            k++;    	
             }
            else if(k==15)
            {
            int a=Integer.parseInt(T5.getText());
           	int b=Integer.parseInt(T6.getText());
           	int c=Integer.parseInt(T7.getText());
            Color c65=new Color(a,b,c);
            b64.setBackground(c65);
            p1.setBackground(c65);
            k=0;    	
             }	  	  	 	   		  	  		  	 	  	
}}
public static void main(String z[])
{
Paint01 ob=new Paint01();
}
}