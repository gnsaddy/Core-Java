import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AppletCalc extends Applet implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button addition,subtraction,multiplication,division;
    public void init()
    {
        l1=new Label("enter first no");
        add(l1);
        t1=new TextField(15);
        add(t1);

        l2=new Label("enter second no");
        add(l2);
        t2=new TextField(15);
        add(t2);

        l3=new Label("Result");
        add(l3);
        t3=new TextField(15);
        add(t3);


        addition=new Button("+");
        add(addition);
        addition.addActionListener(this);


        subtraction=new Button("-");
        add(subtraction);
        subtraction.addActionListener(this);

        multiplication=new Button("*");
        add(multiplication);
        multiplication.addActionListener(this);

        division=new Button("/");
        add(division);
        division.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());

        if(e.getSource()==addition)
        {
            t3.setText(String.valueOf(n1+n2));
        }

        if(e.getSource()==subtraction)
        {
            t3.setText(String.valueOf(n1-n2));
        }

        if(e.getSource()==multiplication)
        {
            t3.setText(String.valueOf(n1*n2));
        }

        if(e.getSource()==division)
        {
            t3.setText(String.valueOf(n1/n2));
        }

    }
    void itemStateChanged(ItemEvent itemEvent)
    {
        repaint();
    }

}
/*
<applet code="AppletCalc" width=200 height=200>
</applet>
*/