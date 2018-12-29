import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Demo extends Applet implements ItemListener,ActionListener {

    Label l1,l2,l3,l4,l5;
    TextField t1,t2;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;
    List list;
    Button b1,b2;
    TextArea txt;
    public void init(){
        l1 = new Label("first name ");
        add(l1);
        t1 = new TextField(25);
        add(t1);
        l2 = new Label("Second name");
        add(l2);
        t2 = new TextField(25);
        add(t2);
        l3 = new Label("Subject");
        add(l3);
        c1 = new Checkbox("C");  add(c1);
        c2 = new Checkbox("C++"); add(c2);
        c3 = new Checkbox("java");  add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        l4 = new Label("Education ");
        add(l4);

        Checkbox r1 = new Checkbox("UG",cg,true);
        Checkbox r2 = new Checkbox("PG",cg,true);
          add(r1);  add(r2);
          r1.addItemListener(this);
          r2.addItemListener(this);

          b1 = new Button("submit");
          b2= new Button("reset");
          add(b1);  add(b2);
          b1.addActionListener(this);
          b2.addActionListener(this);



    }





    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
        }

    }


    public void itemStateChanged(ItemEvent e) {
        repaint();

    }
}
