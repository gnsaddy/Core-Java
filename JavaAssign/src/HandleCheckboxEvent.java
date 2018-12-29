// 18th program

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
 
/*
<applet code="HandleCheckboxEvent" width=600 height=400>
</applet>
*/

public class HandleCheckboxEvent extends Applet implements ItemListener{

    Checkbox cricket = null;
    Checkbox football = null;
    Checkbox badminton = null;

    public void init(){

        //create checkboxes
        cricket = new Checkbox("Cricket");
        football = new Checkbox("Football");
        badminton = new Checkbox("Badminton");

        add(cricket);
        add(football);
        add(badminton);

        //add item listeners
        cricket.addItemListener(this);
        football.addItemListener(this);
        badminton.addItemListener(this);
    }

    public void paint(Graphics g){

        g.drawString("Cricket: " + cricket.getState(),10,80);
        g.drawString("Football: " + football.getState(), 10, 100);
        g.drawString("badminton: " + badminton.getState(), 10, 120);

    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
}