import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Math extends JFrame implements ActionListener
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3;
	
	int num1=0,num2=0;
	
	public Math()
	{
		
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		
		l3=new JLabel("*****SIMPLE MATH OPERATION*******");
		l3.setBounds(5,5,300,30);
		add(l3);
		
		l1=new JLabel("Number 1");
		l1.setBounds(10,50,100,30);
		add(l1);
		
		l2=new JLabel("Number 2");
		l2.setBounds(10,100,100,30);
		add(l2);
		
		t1=new JTextField();	//	num1 input
		t1.setBounds(70,50,60,30);
		add(t1);
		
		t2=new JTextField();	// num2 input
		t2.setBounds(70,100,60,30);
		add(t2);
			
		b1=new JButton("Greater");	//greater button
		b1.setBounds(10,160,80,30);
		add(b1);
		
		t3=new JTextField();		//output num3
		t3.setBounds(15,200,70,30);
		add(t3);
		
		b2=new JButton("Smaller");			//smaller button
		b2.setBounds(120,160,80,30);
		add(b2);
		
		t4=new JTextField();		//output num4
		t4.setBounds(125,200,70,30);
		add(t4);

		b3=new JButton("Squar");		//num1/num2 squar Button
		b3.setBounds(10,240,80,30);     
		add(b3);
		
		t5=new JTextField();			//num5
		t5.setBounds(5,280,45,30);
		add(t5);
		
		t6=new JTextField();			//num6
		t6.setBounds(50,280,45,30);
		add(t6);
		
		b4=new JButton("Facto");		//Num1/num2 Fact Button
		b4.setBounds(120,240,80,30);
		add(b4);
		
		t7=new JTextField();			//num7
		t7.setBounds(100,280,60,30);
		add(t7);
		
		t8=new JTextField();			//num8
		t8.setBounds(160,280,60,30);
		add(t8);
		
		b5=new JButton("Clear");	//Claer Button
		b5.setBounds(70,320,70,30);
		add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		 num1=Integer.parseInt(t1.getText());
		 num2=Integer.parseInt(t2.getText());
		int number1,number2;
		int fact=1,i,fact1=1,j;
		
		if(ae.getSource()==b1)
		{
			if(num1>num2)
			{
				t3.setText(" "+num1);
			}
			else 
			{
				t4.setText(" "+num2);
			}
				
		}
		else if(ae.getSource()==b2)
		{ 
			if(num1<num2)
			{
				t3.setText(" "+num1);
			}
			else 
			{
				t4.setText(" "+num2);
			}
			
		}
		else if(ae.getSource()==b3)
		{
			number1=num1*num1;
			t5.setText(" "+number1);
			number2=num2*num2;
			t6.setText(" "+number2);
		}
		else if(ae.getSource()==b4)
		{
			for(i=1;i<=num1;i++)
			{
				fact=fact*i;
				t7.setText(" "+fact);
			}
			for(j=1;j<=num2;j++)
			{
				fact1=fact1*j;
				t8.setText(" "+fact1);
			}
			
		}
		else
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
			t7.setText(null);
			t8.setText(null);
		}
			
	}
	public static void main(String args[])
	{
		new Math();
	}
}
		