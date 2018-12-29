// 19th program

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
/*
<applet code="HandleActionEventExample" width=600 height=600>
</applet>
*/

public class HandleActionEventExample extends Applet implements ActionListener{

    String actionMessage="";

    public void init(){
        Button Button1 = new Button("Click 1");
        Button Button2 = new Button("Click 2");
        add(Button1);
        add(Button2);
        Button1.addActionListener(this);
        Button2.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(actionMessage,10,50);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if(action.equals("Click 1"))
            actionMessage = "Click 1 Button Pressed";
        else if(action.equals("Click 2"))
            actionMessage = "Click 2 Button Pressed";

        repaint();
    }
}