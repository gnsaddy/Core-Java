import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gnsad on 11-11-2017.
 */

public class LoginForm extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1,btn2;
    JPasswordField passwordField;
    LoginForm() {
        JFrame frame = new JFrame("Login Form");
        l1 = new JLabel("Login Form");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        tf1 = new JTextField();
        passwordField = new JPasswordField();
        btn1 = new JButton("Login");
        btn2 = new JButton("Register");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        passwordField.setBounds(300, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);
        btn2.setBounds(350,160,100,30);

        frame.add(l1);
        frame.add(l2);
        frame.add(tf1);
        frame.add(l3);
        frame.add(passwordField);
        frame.add(btn1);
        frame.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String uname = tf1.getText();
        String pass = passwordField.getText();
        if(uname.equals("aditya@gmail.com") && pass.equals("1234"))
        {
            LoginDis obj = new LoginDis();
            obj.setVisible(true);
            JLabel label = new JLabel("Welcome:"+uname +" u are logged to ur account !!!!!!!!!!");
            obj.getContentPane().add(label);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Incorrect login or password",
                    "Error",JOptionPane.ERROR_MESSAGE);
            if(e.getSource() ==btn2){

                new Registration();
            }
        }


    }
       public static void main(String[] args) {
            new LoginForm();
        }
}
