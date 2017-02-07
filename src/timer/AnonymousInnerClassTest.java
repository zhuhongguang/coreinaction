package timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class AnonymousInnerClassTest {
public static void main(String[] args) {
	TalkingClock clock=new TalkingClock();
	clock.start(1000, true);
}
}
class TalkingClock{
	public void start(int interval,final boolean beep){
		ActionListener listener=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now=new Date();
				System.out.println("At the tone,the time is "+now);
				if(beep)Toolkit.getDefaultToolkit().beep();
			}
			
		};
		Timer t=new Timer(interval,listener);
		t.start();
	}
}
