
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AwtCalc extends Frame implements ActionListener {
    
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5;
    
    AwtCalc() {
        
        l1 = new Label("First number ");
        add(l1);
        t1 = new TextField(25);
        add(t2);
        l2 = new Label("Second number ");
        t2 = new TextField(25);
        add(t2);
        l3 = new Label("Result ");
        add(l3);
        t3 = new TextField(25);
        add(t3);
        b1 = new Button("Add");
         b2 = new Button("Add");
          b3 = new Button("Add");
           b4 = new Button("Add");
            b5 = new Button("Add");
           add(b1);  add(b2);  add(b3);  add(b4);  add(b5);
           
            b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        setLayout(null);
        setVisible(true);
        setSize(400,350);
             
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        
        if(e.getSource()==b1)
        {
            t3.setText(String.valueOf(n1+n2));
        }
            
        if(e.getSource()==b2)
        {
            t3.setText(String.valueOf(n1-n2));
        }
        
        if(e.getSource()==b3)
        {
            t3.setText(String.valueOf(n1*n2));
        }
        
        if(e.getSource()==b4)
        {
            t3.setText(String.valueOf(n1/n2));
        }
        
        if(e.getSource()==b5)
        {
            System.exit(0);
        }
    }
     public static void main(String...s)
    {
        new AwtCalc();
    }
    
}
