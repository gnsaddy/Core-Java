import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RadioButtonCheck extends JFrame implements  ActionListener
{
	
JButton bt1;
JRadioButton rb1,rb2;
ButtonGroup bg;

RadioButtonCheck()  {
	
	bg= new ButtonGroup();
	rb1=new JRadioButton("Male ");
	rb2=new JRadioButton("female ");
	 bg = new ButtonGroup();
	
	
	rb1.setBounds(100,200,200,100);
	rb2.setBounds(300,200,200,100);
	bg.add(rb1);  bg.add(rb2);
	
	bt1=new JButton("Click kar");
	add(bt1); add(rb1);  add(rb2);
	bt1.addActionListener(this);
	
	
	rb1.setBounds(100,200,200,100);
	rb2.setBounds(300,200,200,100);
	bt1.setBounds(150,300,200,100);
	
	
	    setSize(400, 400);
        setLayout(null);
        setVisible(true);
		
		
}
public void actionPerformed(ActionEvent e){
	
	if(rb1.isSelected()){
		JOptionPane.showMessageDialog(this,"male hai tu");
	}
	
	if(rb2.isSelected()){
		JOptionPane.showMessageDialog(this,"female hai tu");
	}
	
}

public static void main(String[] args)
{
	new RadioButtonCheck();
}
}
	
	
	
	
	
	
	
	
	
	