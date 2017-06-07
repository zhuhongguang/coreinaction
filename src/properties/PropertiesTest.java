package properties;

import java.awt.EventQueue;
import java.io.File;
import java.util.Properties;

import javax.swing.JFrame;
public class PropertiesTest {
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			// TODO Auto-generated method stub
			PropertiesFrame frame=new PropertiesFrame();
			frame.setVisible(true);
		}
	});
}
}
class PropertiesFrame extends JFrame{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	private File propertiesFile;
	private Properties settings;
	public PropertiesFrame(){
	String userDir=System.getProperty("user.home");
	File propertiesDir=new File(userDir,".corejava");
	
	if(!propertiesDir.exists()) 
		propertiesDir.mkdir();
	propertiesFile=new File(propertiesDir,"program.properties");
	
	Properties defaultSetting=new Properties();
	defaultSetting.put("left", "0");
	}
}
