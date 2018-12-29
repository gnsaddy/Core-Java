import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ComboBox extends JFrame implements ItemListener {
	
	JComboBox cb;
	JLabel l;
	
	ComboBox() {
		//Frame f= getContentPane();
		
		l = new JLabel("Choose ");
		l.setBounds(60,200,200,30);
		add(l);
		
		cb = new JComboBox();
		cb.addItem("India");
		cb.addItem("japan");
		cb.addItem("Aus");
		cb.addItem("Pak");
		cb.addItem("WstInd");
		
		cb.setBounds(100,200,200,30);
		add(cb);
		cb.addItemListener(this);
		
		setLayout(null);
        setVisible(true);
        setSize(400,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void itemStateChanged(ItemEvent e){
			String str = (String)cb.getSelectedItem();
			l.setText("you selected  "  +str);
		}
		
		public static void main(String[] args)
		{
			ComboBox obj = new ComboBox();
			obj.setTitle("My ComboBox");
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	