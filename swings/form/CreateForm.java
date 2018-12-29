import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class CreateForm extends JFrame implements ActionListener {
	
	 JLabel ul;
	JLabel[] l = new JLabel[6];
	JTextField[] t = new JTextField[5];
	JButton[] b = new JButton[4];
	
	CreateForm() {
		ul = new JLabel("EMPLOYEE DETAILS  ");
		ul.setBounds(150,50,200,30);
		l[0] = new JLabel("Emp ID ");  l[1] = new JLabel("First name  ");
		l[2] = new JLabel("Last name  ");  l[3] = new JLabel("Post  ");
		l[4] = new JLabel("Address  ");  l[5] = new JLabel("City  ");
		
		for (int i=0;i<=6;i++){
			l[i].setBounds(50,(100+(50*i)),200,30);
		}
		
		for(int i=0;i<=5;i++){
			
		t[i] = new JTextField(); 
        t[i].setBounds(200,(100+(50*i)),300,30);	
		}
		
		b[0] = new JButton("Submit  ");  b[1] = new JButton("Delete  ");  b[2] = new JButton("Update  ");
        b[3] = new JButton("Exit  ");		

        for(int i=0;i<=4;i++){
			
			b[i].setBounds((50+(50*i)),400,200,30);
		}









            public void actionPerformed(ActionEvent e){
      
           String str = e.getActionCommand();
            String t[i];


            if (str.equals("Submit"))
			{
               for(int i=0;i<=5;i++){
                   t[i].getText();
			   }
			   
			   JOptionPane.show.MessageDialog(this,"your data is submitted  "  + (t[i]));
			}
			}
			
			
			public static void main(String[] args)
			{
				new CreateForm();
			}
	}
			
			






















			
		
		