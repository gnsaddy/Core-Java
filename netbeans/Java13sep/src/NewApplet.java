/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;

/**
 *
 * @author Aditya PC
 */
public class NewApplet extends Applet {
    String st;
public void init()
{
    setBackground(Color.red);
st="welcome user";
}
public void paint(Graphics g)
{
g.drawString(st,100,100);
}


}


