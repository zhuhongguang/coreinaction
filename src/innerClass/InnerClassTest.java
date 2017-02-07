package innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;

import javax.swing.Timer;

public class InnerClassTest {
public static void main(String[] args) {
	TalkingClock clock=new TalkingClock(1000,true);
	clock.start();
	JOptionPane.showMessageDialog(null, "Quit program?");
	System.exit(0);;
}
}
class TalkingClock{
	private int inerval;
	private boolean beep;
	public TalkingClock(int inerval,boolean beep){
		this.inerval=inerval;
		this.beep=beep;
	}
	public void start(){
		ActionListener listener=new TimePrinter();
		Timer t=new Timer(inerval,listener);
		t.start();
	}
	public class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Date now =new Date();
			System.out.println("At the tone,the time is "+now);
			if(beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}