
import java.applet.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class NewApplet1 extends Applet implements ItemListener  {
 Checkbox c;
 Checkbox cpp;
 Checkbox java;
    
    public void init() {
        c= new Checkbox("c");
        cpp=new Checkbox("c++");
        java = new Checkbox("java");
         add(c); add(cpp);  add(java);
         
         c.addItemListener(this);
         cpp.addItemListener(this);
         java.addItemListener(this);
         }

    @Override
    public void itemStateChanged(ItemEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); 
        repaint();
    }
    public void paint(Graphics g)
    { 
        g.drawString("Select choice " ,10,20);
        g.drawString("c " +c.getState(),10,80);
        g.drawString("c++ " +cpp.getState(),10,100);
        g.drawString("java " +java.getState(),10,120);
       }

    }

