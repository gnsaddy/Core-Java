package UseFrames;

import javax.swing.*;

/**
 * Created by gnsad on 6/29/2018.
 */
public class DialDemo extends JDialog {
    JDialog obj;
    public DialDemo(){
        obj=new JDialog();
        obj.setTitle("JDialog Demo");
        obj.setVisible(true);
        obj.setSize(300,150);
    }
    public static void main(String[] args){
        new DialDemo();
    }
}
