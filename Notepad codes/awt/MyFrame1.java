// implementation of frame via association that is "has-a " relationship

import java.awt.*;

class MyFrame1 {
	Frame f = new Frame();
	
	MyFrame1(){
		f.setTitle("CHECK FRAME");
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
	}
	public static void main(String[] args)
	{
		new MyFrame1();
		
	}
}