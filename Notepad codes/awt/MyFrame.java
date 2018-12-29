//implementation of frame via aggregation that is "is-a" relationship
import java.awt.*;

class MyFrame extends Frame  {
	
	MyFrame(String s) {
		super(s);
		 setLayout(null);
        setVisible(true);
        setSize(400,350);
	}
	
	public static void main(String[] args){
		MyFrame m = new MyFrame("AWT FRAME ");
		//m.setSize(350,300);
		//m.setTitle("AWT Frame");
		//m.setVisible(true);
	}
}