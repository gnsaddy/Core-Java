// 23rd program

import java.awt.*;
import java.awt.event.*;
import java.io.*;
class MyNotepad extends Frame implements ActionListener
{
    private TextArea txta_show;
    private Menu file;
    private MenuItem New,Open,Save,Exit;
    private MenuBar mb=new MenuBar();

    public MyNotepad()
    {
        file=new Menu("File");
        New=new MenuItem("New");
        Open=new MenuItem("Open");
        Save=new MenuItem("Save");
        Exit=new MenuItem("Exit");

        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Exit);

        mb.add(file);

        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Exit.addActionListener(this);

        setTitle("Notpad");
        setSize(400,400);
        setLocation(100,100);
        setMenuBar(mb);

        txta_show=new TextArea();
        add(txta_show);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==New)
        {
            txta_show.setText(" ");
        }
        else if(ae.getSource()==Open)
        {
            try
            {
                FileDialog fd=new FileDialog(this,"Open File",FileDialog.LOAD);
                fd.setVisible(true);
                String dir=fd.getDirectory();
                String fname=fd.getFile();
                FileInputStream fis=new FileInputStream(dir+fname);
                DataInputStream dis=new DataInputStream(fis);
                String str=" ",msg=" ";
                while((str=dis.readLine())!=null)
                {
                    msg=msg+str;
                    msg+="\n";
                }
                txta_show.setText(msg);
                dis.close();
            }
            catch(Exception e){}
        }
        else if(ae.getSource()==Save)
        {
            try
            {
                FileDialog fd=new FileDialog(this,"Save File",FileDialog.SAVE);
                fd.setVisible(true);
                String txt=txta_show.getText();
                String dir=fd.getDirectory();
                String fname=fd.getFile();
                FileOutputStream fos=new FileOutputStream(dir+fname);
                DataOutputStream dos=new DataOutputStream(fos);
                dos.writeBytes(txt);
                dos.close();
            }
            catch(Exception e)
            {
            }
        }
        else if(ae.getSource()==Exit)
        {
            System.exit(0);
        }
    }
}
class Notepad
{
    public static void main(String []args)
    {
        new MyNotepad().setVisible(true);
    }
}