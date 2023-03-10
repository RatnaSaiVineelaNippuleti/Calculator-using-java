package calculator;

	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	import java.awt.event.ActionListener;
	//import java.lang.Exception.*;
	public class Calcy extends JFrame implements ActionListener
	{
	JRadioButton r1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
	JButton b27,b28,b29,b30,b31,b32,b33,b34,b35;
	JTextField t;
	String a,b,c,d,e,f,g,h;
	int k;
	Double n;
	Calcy()
	{
	setTitle("CALCULATOR");
	BorderLayout b=new BorderLayout();
	setLayout(b);
	setVisible(true);
	setSize(1000,1000);
	setTitle("Calculator");
	Label l=new Label("Calculator");
	Font f1=new Font("Serif",Font.BOLD,40);
	l.setFont(f1);
	JPanel j=new JPanel();
	j.add(l);
	GridBagLayout j1=new GridBagLayout();
	JPanel p3=new JPanel();
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.insets=new Insets(1,1,1,1);
	p3.setLayout(j1);
	r1=new JRadioButton("on/off");
	gbc.gridx=0;
	gbc.gridy=5;
	gbc.gridwidth=1;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	p3.add(r1,gbc);
	b1=new JButton("sqrt(");
	gbc.gridx=0;
	gbc.gridy=10;
	p3.add(b1,gbc);
	b1.setEnabled(false);
	b2=new JButton("exp");
	gbc.gridx=1;
	gbc.gridy=10;
	p3.add(b2,gbc);
	b2.setEnabled(false);
	b3=new JButton("sin");
	gbc.gridx=2;
	gbc.gridy=10;
	p3.add(b3,gbc);
	b3.setEnabled(false);
	b4=new JButton("cos");
	gbc.gridx=3;
	gbc.gridy=10;
	p3.add(b4,gbc);
	b4.setEnabled(false);
	b5=new JButton("tan");
	gbc.gridx=4;
	gbc.gridy=10;
	p3.add(b5,gbc);
	b5.setEnabled(false);
	b6=new JButton("1/X");
	gbc.gridx=0;
	gbc.gridy=15;
	p3.add(b6,gbc);
	b6.setEnabled(false);
	b7=new JButton("log");
	gbc.gridx=1;
	gbc.gridy=15;
	p3.add(b7,gbc);
	b7.setEnabled(false);
	b8=new JButton("sinh");
	gbc.gridx=2;
	gbc.gridy=15;
	p3.add(b8,gbc);
	b8.setEnabled(false);
	b9=new JButton("cosh");
	gbc.gridx=3;
	gbc.gridy=15;
	p3.add(b9,gbc);
	b9.setEnabled(false);
	 b10=new JButton("tanh");
	gbc.gridx=4;
	gbc.gridy=15;
	p3.add(b10,gbc);
	b10.setEnabled(false);
	b11=new JButton("x^y");
	gbc.gridx=0;
	gbc.gridy=20;
	p3.add(b11,gbc);
	b11.setEnabled(false);
	b12=new JButton(")");
	gbc.gridx=1;
	gbc.gridy=20;
	p3.add(b12,gbc);
	b12.setEnabled(false);
	b13=new JButton("del");
	gbc.gridx=2;
	gbc.gridy=20;
	p3.add(b13,gbc);
	b13.setEnabled(false);
	b14=new JButton("clr");
	gbc.gridx=3;
	gbc.gridy=20;
	p3.add(b14,gbc);
	b14.setEnabled(false);
	b15=new JButton("+");
	gbc.gridx=4;
	gbc.gridy=20;
	p3.add(b15,gbc);
	b15.setEnabled(false);
	b16=new JButton("x3");
	gbc.gridx=0;
	gbc.gridy=25;
	p3.add(b16,gbc);
	b16.setEnabled(false);
	b17=new JButton("7");
	gbc.gridx=1;
	gbc.gridy=25;
	p3.add(b17,gbc);
	b17.setEnabled(false);
	b18=new JButton("8");
	gbc.gridx=2;
	gbc.gridy=25;
	p3.add(b18,gbc);
	b18.setEnabled(false);
	 b19=new JButton("9");
	gbc.gridx=3;
	gbc.gridy=25;
	p3.add(b19,gbc);
	b19.setEnabled(false);
	 b20=new JButton("-");
	gbc.gridx=4;
	gbc.gridy=25;
	p3.add(b20,gbc);
	b20.setEnabled(false);
	b21=new JButton("x2");
	gbc.gridx=0;
	gbc.gridy=30;
	p3.add(b21,gbc);
	b21.setEnabled(false);
	b22=new JButton("4");
	gbc.gridx=1;
	gbc.gridy=30;
	p3.add(b22,gbc);
	b22.setEnabled(false);
	b23=new JButton("5");
	gbc.gridx=2;
	gbc.gridy=30;
	p3.add(b23,gbc);
	b23.setEnabled(false);
	b24=new JButton("6");
	gbc.gridx=3;
	gbc.gridy=30;
	p3.add(b24,gbc);
	b24.setEnabled(false);
	b25=new JButton("*");
	gbc.gridx=4;
	gbc.gridy=30;
	p3.add(b25,gbc);
	b25.setEnabled(false);
	b26=new JButton("n!");
	gbc.gridx=0;
	gbc.gridy=35;
	p3.add(b26,gbc);
	b26.setEnabled(false);
	 b27=new JButton("1");
	gbc.gridx=1;
	gbc.gridy=35;
	p3.add(b27,gbc);
	b27.setEnabled(false);
	 b28=new JButton("2");
	gbc.gridx=2;
	gbc.gridy=35;
	p3.add(b28,gbc);
	b28.setEnabled(false);
	b29=new JButton("3");
	gbc.gridx=3;
	gbc.gridy=35;
	p3.add(b29,gbc);
	b29.setEnabled(false);
	 b30=new JButton("/");
	gbc.gridx=4;
	gbc.gridy=35;
	p3.add(b30,gbc);
	b30.setEnabled(false);
	b31=new JButton("+/-");
	gbc.gridx=0;
	gbc.gridy=40;
	p3.add(b31,gbc);
	b31.setEnabled(false);
	b32=new JButton("=");
	gbc.gridx=4;
	gbc.gridy=40;
	p3.add(b32,gbc);
	b32.setEnabled(false);
	b34=new JButton("%");
	gbc.gridx=3;
	gbc.gridy=40;
	p3.add(b34,gbc);
	b34.setEnabled(false);
	b35=new JButton("Ans");
	gbc.gridx=1;
	gbc.gridy=40;
	p3.add(b35,gbc);
	b35.setEnabled(false);
	b33=new JButton("0");
	gbc.gridx=2;
	gbc.gridy=40;
	gbc.gridwidth=1;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	p3.add(b33,gbc);
	b33.setEnabled(false);
	 t=new JTextField(15);
	Font f2=new Font("Serif",Font.PLAIN,15);
	t.setFont(f2);
	t.setPreferredSize(new Dimension(50,50));
	gbc.gridx=0;
	gbc.gridy=0;
	gbc.gridwidth=10;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	p3.add(t,gbc);
	add(j,BorderLayout.NORTH);
	add(p3,BorderLayout.CENTER);
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
	r1.addActionListener(this);
	addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent ae)
	{
	System.exit(0);
	}
	});
	}
	public void actionPerformed(ActionEvent ae)
	{
	try
	{
	if(ae.getSource()==b33)
	{
	 a=t.getText();
	 b="0";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b17)
	{
	 a=t.getText();
	 b="7";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b18)
	{
	 a=t.getText();
	 b="8";
	 f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b19)
	{
	 a=t.getText();
	 b="9";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b22)
	{
	 a=t.getText();
	 b="4";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b23)
	{
	 a=t.getText();
	 b="5";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b24)
	{
	 a=t.getText();
	 b="6";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b27)
	{
	 a=t.getText();
	 b="1";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b28)
	{
	 a=t.getText();
	 b="2";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b29)
	{
	 a=t.getText();
	 b="3";
	f=a+b;
	t.setText(f);
	}

	if(ae.getSource()==b12)
	{
	a=t.getText();
	 b=")";
	f=a+b;
	t.setText(f);
	}
	if(ae.getSource()==b30)
	{
	 d=t.getText();
	t.setText(" ");
	k=4;
	}
	if(ae.getSource()==b15)
	{
	d=t.getText();
	t.setText(" ");
	k=1;
	}
	if(ae.getSource()==b20)
	{
	d=t.getText();
	t.setText(" ");
	k=2;
	}
	if(ae.getSource()==b25)
	{
	d=t.getText();
	t.setText(" ");
	k=3;
	}
	if(ae.getSource()==b34)
	{
	d=t.getText();
	t.setText(" ");
	k=14;
	}
	if(ae.getSource()==b2)
	{
	d=t.getText();
	t.setText(d+"exp(");
	k=5;
	}
	if(ae.getSource()==b3)
	{
	d=t.getText();
	t.setText(d+"sin(");
	k=6;
	}
	if(ae.getSource()==b4)
	{
	d=t.getText();
	t.setText(d+"cos(");
	k=7;
	}
	if(ae.getSource()==b5)
	{
	d=t.getText();
	t.setText(d+"tan(");
	k=8;
	}
	if(ae.getSource()==b7)
	{
	d=t.getText();
	t.setText("log(");
	k=9;
	}
	if(ae.getSource()==b8)
	{
	d=t.getText();
	t.setText(d+"sinh(");
	k=10;
	}
	if(ae.getSource()==b9)
	{
	d=t.getText();
	t.setText(d+"cosh(");
	k=11;
	}
	if(ae.getSource()==b10)
	{
	d=t.getText();
	t.setText(d+"tanh(");
	k=12;
	}
	if(ae.getSource()==b1)
	{
	d=t.getText();
	t.setText(d+"sqrt(");
	k=13;
	}
	if(ae.getSource()==b11)
	{
	d=t.getText();
	t.setText(" ");
	k=15;
	}
	if(ae.getSource()==b32)
	{
	e=t.getText();
	if(k==1)
	{
	n=Double.parseDouble(e.trim())+Double.parseDouble(d.trim());//addition
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==2)
	{
	n=Double.parseDouble(d.trim())-Double.parseDouble(e.trim());//subtraction
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==3)
	{
	n=Double.parseDouble(d.trim())*Double.parseDouble(e.trim());//multiplication
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==4)
	{
	n=Double.parseDouble(d.trim())/Double.parseDouble(e.trim());//division
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==5)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(4,f-1));//exponential
	n=Math.exp(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==6)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(4,f-1));//sine function
	n=Math.sin(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==7)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(4,f-1));//cosine function
	n=Math.cos(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==8)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(4,f-1));//tangent function
	n=Math.tan(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==9)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(4,f-1));//logarithmic function
	n=Math.log(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==10)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(5,f-1));//sinh function
	n=Math.sinh(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==11)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(5,f-1));//cosh function
	n=Math.cosh(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==12)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(5,f-1));//tanh function
	n=Math.tanh(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==13)
	{
	String g=t.getText().trim();
	int f=g.length();
	n=Double.parseDouble(g.substring(5,f-1));//square root
	n=Math.sqrt(n);
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==14)
	{
	n=Double.parseDouble(d.trim())%Double.parseDouble(e.trim());//Modulus
	t.setText(String.valueOf(n));
	k=0;
	}
	if(k==15)
	{
	double n1=Double.parseDouble(d.trim());//x^y
	int p=Integer.parseInt(e.trim());
	n=1.0d;
	if(p==0)
	{
	t.setText(String.valueOf("1"));
	k=0;
	}
	else
	{
	for(int i=1;i<=p;i++)
	{
	n=n*n1;
	}
	t.setText(String.valueOf(n));
	k=0;
	}}
	if(k==0)
	{
	t.setText(String.valueOf(n));
	}
	}
	if(ae.getSource()==b31)
	{
	n=Double.parseDouble(t.getText().trim());
	n=(-1)*n;
	t.setText(String.valueOf(n));
	}
	if(ae.getSource()==b6)
	{
	n=1/Double.parseDouble(t.getText().trim());//1/x
	t.setText(String.valueOf(n));
	k=0;
	}
	if(ae.getSource()==b16)
	{
	n=Double.parseDouble(t.getText().trim());//x^3
	n=n*n*n;
	t.setText(String.valueOf(n));
	k=0;
	}
	if(ae.getSource()==b26)
	{
	int f=Integer.parseInt(t.getText().trim());//factorial
	n=1.0d;
	if(f==0)
	{
	t.setText(String.valueOf("1"));
	k=0;
	}
	else
	{
	while(f>0)
	{
	n=n*f;
	f--;
	}
	t.setText(String.valueOf(n));
	k=0;
	}}
	if(ae.getSource()==b21)//x^2
	{
	n=Double.parseDouble(t.getText().trim());
	n=n*n;
	t.setText(String.valueOf(n));
	k=0;
	}
	if(ae.getSource()==b35)
	{
	t.setText(t.getText()+String.valueOf(n));
	}
	if(ae.getSource()==b14)//clear text
	{
	t.setText(" ");
	a=" ";b=" ";c=" ";d=" ";e=" ";f=" ";
	}
	if(ae.getSource()==b13)//backspace
	{
	e=t.getText();
	int h=e.length();
	if(h>0)
	{
	t.setText(e.substring(0,h-1));
	}}
	if(r1.isSelected())
	{
	b1.setEnabled(true);b2.setEnabled(true);b3.setEnabled(true);b4.setEnabled(true);b5.setEnabled(true);
	b6.setEnabled(true);b7.setEnabled(true);b8.setEnabled(true);b9.setEnabled(true);b10.setEnabled(true);
	b11.setEnabled(true);b12.setEnabled(true);b13.setEnabled(true);b14.setEnabled(true);b15.setEnabled(true);
	b16.setEnabled(true);b17.setEnabled(true);b18.setEnabled(true);b19.setEnabled(true);b20.setEnabled(true);
	b21.setEnabled(true);b22.setEnabled(true);b23.setEnabled(true);b24.setEnabled(true);b25.setEnabled(true);
	b26.setEnabled(true);b27.setEnabled(true);b28.setEnabled(true);b29.setEnabled(true);b30.setEnabled(true);
	b31.setEnabled(true);b32.setEnabled(true);b33.setEnabled(true);b34.setEnabled(true);b35.setEnabled(true);
	}
	else
	{
	t.setText(" ");
	b1.setEnabled(false);b2.setEnabled(false);b3.setEnabled(false);b4.setEnabled(false);b5.setEnabled(false);
	b6.setEnabled(false);b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);b10.setEnabled(false);
	b11.setEnabled(false);b12.setEnabled(false);b13.setEnabled(false);b14.setEnabled(false);b15.setEnabled(false);
	b16.setEnabled(false);b17.setEnabled(false);b18.setEnabled(false);b19.setEnabled(false);b20.setEnabled(false);
	b21.setEnabled(false);b22.setEnabled(false);b23.setEnabled(false);b24.setEnabled(false);b25.setEnabled(false);
	b26.setEnabled(false);b27.setEnabled(false);b28.setEnabled(false);b29.setEnabled(false);b30.setEnabled(false);
	b31.setEnabled(false);b32.setEnabled(false);b33.setEnabled(false);b34.setEnabled(false);b35.setEnabled(false);
	}
	}
	catch(Exception e)
	{
	t.setText("syntax error");
	}
	}
	public static void main(String args[])
	{
	Calcy a=new Calcy();
	}
	}


